package com.starwar.movie.repository;

import com.starwar.movie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RegisterRepository extends JpaRepository<User,Long> {

    boolean existsByUsernameIgnoreCase(String username);
}
