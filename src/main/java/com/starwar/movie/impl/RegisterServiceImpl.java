package com.starwar.movie.impl;

import com.starwar.movie.dao.RegisterService;
import com.starwar.movie.exception.RegisterException;
import com.starwar.movie.model.Role;
import com.starwar.movie.model.User;
import com.starwar.movie.enums.ERole;
import com.starwar.movie.repository.RegisterRepository;
import com.starwar.movie.repository.RoleRepository;
import com.starwar.movie.util.RegisterRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.HashSet;
import java.util.Set;
@Service
@Slf4j
public class RegisterServiceImpl implements RegisterService {


    @Autowired
    PasswordEncoder encoder;
    @Autowired
    RegisterRepository registerRepository;

    @Autowired
    RoleRepository roleRepository;
    @Override
    public User registerUser(RegisterRequest registerRequest) throws RegisterException {
        log.trace("Enter Method registerUser: {}",registerRequest);

        log.info("Enter Method registerUser: Checking if username already exists: Username={}",registerRequest.getUsername());

        if (registerRepository.existsByUsernameIgnoreCase(registerRequest.getUsername())) {

            log.error("Return Method registerUser: Username Already Exists Username={}", registerRequest.getUsername());
            throw new RegisterException("username already exist");
        }

        try {


            //Pass User Entity into an object called User
            User newUser = new User();


            newUser.setUsername(registerRequest.getUsername());
            newUser.setPassword(encoder.encode(registerRequest.getPassword()));



            // A new user will automatically be assigned a role of "ROLE_CUSTOMER"
            Set<String> strRoles = registerRequest.getRole();
            Set<Role> role = new HashSet<>();
            if (strRoles == null) {
                Role userRole = roleRepository.findByRoleName(ERole.ROLE_ADMIN)
                        .orElseThrow(() -> new RuntimeException("ERROR: Role is not found."));
                role.add(userRole);
            }
            // Sets the role after user as created their account
            newUser.setRole(role);

            log.info("Return Method registerUser: User registered successfully: Username={} , Status={}",registerRequest.getUsername() , HttpStatus.OK);
            return registerRepository.save(newUser);
        }
        catch (Exception e) {
            log.error("Return Method registerUser, error creating user: {}", registerRequest.getUsername());
            throw new RuntimeException("Failed to add user", e);
        }
    }
}