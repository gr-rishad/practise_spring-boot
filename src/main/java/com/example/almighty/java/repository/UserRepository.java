package com.example.almighty.java.repository;

import com.example.almighty.java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
