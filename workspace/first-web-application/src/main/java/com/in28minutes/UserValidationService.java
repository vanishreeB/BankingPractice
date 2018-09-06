package com.in28minutes;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean isValidUser(String user , String password){
		if (user.equals("vani")&& password.equals("vani"))
			return true;
		
		return false;
	}
}
