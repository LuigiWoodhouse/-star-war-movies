package com.starwar.movie.util;

import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {

    private String username;

    private String password;

    private Set<String> role;
}
