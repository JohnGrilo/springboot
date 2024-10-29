package com.grilocompany.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grilocompany.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
