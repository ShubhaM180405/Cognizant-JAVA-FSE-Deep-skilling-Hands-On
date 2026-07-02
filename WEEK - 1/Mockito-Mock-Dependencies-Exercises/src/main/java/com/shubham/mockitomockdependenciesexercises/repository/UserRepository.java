package com.shubham.mockitomockdependenciesexercises.repository;

import com.shubham.mockitomockdependenciesexercises.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}