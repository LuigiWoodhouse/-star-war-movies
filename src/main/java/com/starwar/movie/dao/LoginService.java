package com.starwar.movie.dao;

import com.starwar.movie.jwt.JwtResponse;
import com.starwar.movie.util.LoginRequest;
import org.springframework.http.ResponseEntity;

import javax.security.auth.login.LoginException;

public interface LoginService {

    ResponseEntity<JwtResponse> loginUser(LoginRequest loginRequest) throws LoginException;

}
