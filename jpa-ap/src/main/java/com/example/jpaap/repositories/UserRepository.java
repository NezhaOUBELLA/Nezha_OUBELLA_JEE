package com.example.jpaap.repositories;

import com.example.jpaap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String userName);
}
