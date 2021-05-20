package com.cg.loginRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.loginRegistration.entities.Registration;

@Repository
public interface IRegistrationRepository extends JpaRepository<Registration, String> {

}
