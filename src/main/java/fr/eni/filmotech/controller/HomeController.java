package fr.eni.filmotech.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.filmotech.bo.Movie;
import fr.eni.filmotech.service.MovieService;

@Controller
public class HomeController {
	
	private MovieService service;
	
	public HomeController(MovieService service) {
		this.service = service;
	}
	
	@GetMapping({"/home","","/"})
	public String homePage(Model model) {
		
			Optional<Movie> findMovie = service.findMovie();
			model.addAttribute("movie",findMovie.get());
		
		return "welcome";
	}

}
