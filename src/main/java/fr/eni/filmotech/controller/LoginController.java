package fr.eni.filmotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotech.bo.Member;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(@ModelAttribute("member")Member member) {
		return "login";
	}
	
	@PostMapping("/login")
	public String userlogin(@ModelAttribute("member")Member member) {
		
		return "login";
		
	}

}
