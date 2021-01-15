package com.example.demoboot.repository;

import com.example.demoboot.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByLastName(String lastName);

    boolean existsByLastName(String lastName);



}
