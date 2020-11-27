package fr.eni.filmotech.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String userlogin(@Valid @ModelAttribute("member")Member member, BindingResult result, Model model) {
		Member user = null;
		try {
			user = membreService.trouverMembre(member.username, member.password);

		} catch(Exception e) {
			System.out.println(user);
			return "redirect:login";
		}
		if (result.hasErrors()) {
			return "redirect:login";
		} else {
			return "welcome";
		}
	
	}

}
