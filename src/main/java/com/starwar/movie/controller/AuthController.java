package com.starwar.movie.controller;

import com.starwar.movie.dao.LoginService;
import com.starwar.movie.dao.RegisterService;
import com.starwar.movie.exception.RegisterException;
import com.starwar.movie.jwt.JwtResponse;
import com.starwar.movie.jwt.JwtUtils;
import com.starwar.movie.model.User;
import com.starwar.movie.repository.UserRepository;
import com.starwar.movie.util.LoginRequest;
import com.starwar.movie.util.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.LoginException;

@RestController
@RequestMapping("/login")
public class AuthController {
    @Autowired
    LoginService loginService;

    @Autowired
    RegisterService registerService;

    @PostMapping("/authenticate")
    public ResponseEntity<JwtResponse> loginUser(@RequestBody LoginRequest loginRequest) throws LoginException {
        return loginService.loginUser(loginRequest);
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest registerRequest) throws RegisterException {
        return registerService.registerUser(registerRequest);
    }
}