package com.fdmgroup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.model.User;



@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String loginPageController(Model model){
		model.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping(value = "submitLogin", method=POST)
	public String loginSubmitHandler(Model model, User user) {
		model.addAttribute("user", user); // taking information from the page submitted
		String username = user.getUserName();
		String password = user.getPassword();
		return "login";
		
//		UsersDao userDao = new UsersDao();
//		User tempuser = userDao.getUSer(username);
//		
//		// not a good practice to because if first past is not null then second part will never be executed
//		// therefore avoid 
//		if(user != null && tempuser.getPassword().equals(password)){
//			return "loginsuccess";
//		}
//		else
//			return "login";
		
		//return "loginsuccess"; // must be the name of jsp page with case sensitivity
	}
	
	@RequestMapping(value = "registration")
	public String registrationHandler(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@RequestMapping(value = "submitRegistration", method=POST)
	public String registrationSubmitHandler(Model model, User user){
		
		return "registration";
		
	}
	
}
