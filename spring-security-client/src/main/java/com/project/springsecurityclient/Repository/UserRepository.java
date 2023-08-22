package com.project.springsecurityclient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springsecurityclient.model.SignUpForm;

import com.project.springsecurityclient.model.Users;

import jakarta.persistence.EntityManager;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	void save(SignUpForm signupForm);

	

}
