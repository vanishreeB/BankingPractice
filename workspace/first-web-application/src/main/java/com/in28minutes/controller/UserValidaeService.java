package com.in28minutes.controller;

import org.springframework.stereotype.Service;

@Service
public class UserValidaeService {

	public boolean isValidUser(String user , String password){
		if (user.equals("vani")&& password.equals("vani"))
			return true;
		
		return false;
	}
}
