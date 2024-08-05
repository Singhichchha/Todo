package com.springboot.webapp.Todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.webapp.Todo.service.TodoAuthenticationService;



@Controller
@SessionAttributes("name")
public class TodoLoginController {

	private TodoAuthenticationService authenticationService;

	public TodoLoginController(TodoAuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	// login?name=Ranga RequestParam
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.authenticate(name, password)) {

			model.put("name", name);
			// Authentication
			// name - in28minutes
			// password - dummy

			return "welcome";
		}

		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
}