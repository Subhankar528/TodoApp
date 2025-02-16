package com.learnSpringWebApp.myfirstspringwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String name,String password) {
		boolean isValidUserName=name.equalsIgnoreCase("Sonu");
		boolean isValidPassword=password.equalsIgnoreCase("Pass");
		return isValidUserName && isValidPassword ;
	}
}
