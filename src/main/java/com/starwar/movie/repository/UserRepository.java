package com.starwar.movie.repository;


import com.starwar.movie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameIgnoreCase(String username);

}
