package com.cg.loginRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.loginRegistration.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String>{

}
