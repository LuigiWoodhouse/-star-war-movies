package com.starwar.movie.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.starwar.movie.dao.LoginService;
import com.starwar.movie.jwt.JwtResponse;
import com.starwar.movie.jwt.JwtUtils;
import com.starwar.movie.repository.UserRepository;
import com.starwar.movie.util.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<JwtResponse> loginUser(LoginRequest loginRequest) throws AuthenticationException {


        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        String jwt = jwtUtils.generateJwtToken(userDetails);


        List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
                .collect(Collectors.toList());



        return ResponseEntity.ok(new JwtResponse(
                jwt,
                userDetails.getUserId(),
                userDetails.getUsername(),
                roles
        ));
    }
}
