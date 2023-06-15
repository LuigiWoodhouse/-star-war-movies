package com.starwar.movie.jwt;

import lombok.Data;
import java.util.List;
@Data
public class JwtResponse {

    private String tokenType = "Bearer";
    private String token;
    private Long userId;
    private String username;
    private List<String> roles;

    public JwtResponse(String token, Long userId, String username, List<String> roles) {
        this.token = token;
        this.userId = userId;
        this.username = username;
        this.roles = roles;
    }
}
