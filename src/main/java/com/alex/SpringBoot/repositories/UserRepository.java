package com.alex.SpringBoot.repositories;


import com.alex.SpringBoot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
