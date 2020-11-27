package fr.eni.filmotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotech.bo.Member;
import fr.eni.filmotech.services.MembreService;

@Controller
public class LoginController {
	
	private MembreService membreService;
	
	public LoginController(MembreService membreService) {
		this.membreService = membreService;
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute("member")Member member) {
		return "login";
	}
	
	@PostMapping("/login")
	public String userlogin(@ModelAttribute("member")Member member, Model model) {
		Member user;
		user = membreService.trouverMembre(member.username, member.password);
		if (user==null) {
			model.addAttribute(member.username);
			model.addAttribute(member.password);
			return "login";
		} else {
			return "welcome";
		}
	
	}

}
