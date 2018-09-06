package com.in28minutes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	
	@Autowired
	private UserValidaeService uservalidate;
			
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String handleLoginPage(@RequestParam String name,@RequestParam String password, ModelMap model){
		boolean valid = uservalidate.isValidUser(name, password);
		if (valid)
		{
		model.put("name", name);
		return "welcome";
		}
		else{
			model.put("errorMessage", "Invalid user");
			return "login";
		
		}
	}
	
}
