package com.springboot.webapp.Todo.service;

import org.springframework.stereotype.Service;

@Service
public class TodoAuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("admin");
		boolean isValidPassword = password.equalsIgnoreCase("admin");
		return isValidUserName && isValidPassword;
	}
}