package com.starwar.movie.exception;

import org.springframework.http.HttpStatus;

public class RegisterException extends Exception {

    private static final long serialVersionUID = 1L;

    private int code;

    HttpStatus status;

    public RegisterException(String message)
    {
        super(message);
        this.setCode(code);
    }
    public void setCode(int code) {
        this.code = code;
    }
}
