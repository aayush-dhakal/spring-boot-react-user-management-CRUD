package com.aayush.usermanagement.repository;

import com.aayush.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // Long is the data type of the primary key of User table
}
