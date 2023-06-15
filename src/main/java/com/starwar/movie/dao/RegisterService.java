package com.starwar.movie.dao;

import com.starwar.movie.exception.RegisterException;
import com.starwar.movie.model.User;
import com.starwar.movie.util.RegisterRequest;
import lombok.Data;

public interface RegisterService {

    User registerUser(RegisterRequest registerRequest) throws RegisterException;
}
