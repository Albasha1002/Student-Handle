package com.project.springsecurityclient.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springsecurityclient.Repository.UserRepository;
import com.project.springsecurityclient.model.SignUpForm;

import com.project.springsecurityclient.model.Users;

@Controller
public class SignupController {

//  autowire user repository
 @Autowired
 private UserRepository userRepo;

 // method to get signup page
 @GetMapping(path = "/signup")
 public String getSignupPage() {
  return "signup";
 }
 // method to submit signup

 @PostMapping(path="/signup")
 public String submitSignup(SignUpForm signupForm) {
  //check whether the form data is coming or not\
  Users  user = null;
  if(null != signupForm) {
   user = new Users(signupForm.firstName(), signupForm.lastName(), signupForm.emailId(), signupForm.password());
  }
  userRepo.save(user);
	 
	
	 userRepo.save(user);
	 
  return "sign-up-success";
 }
}