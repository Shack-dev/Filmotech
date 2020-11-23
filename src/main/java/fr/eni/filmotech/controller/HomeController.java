package fr.eni.filmotech.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public String homePage() {
		return "welcome";
	}

}
