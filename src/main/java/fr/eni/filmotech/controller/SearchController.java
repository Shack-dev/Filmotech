/**
 * 
 */
package fr.eni.filmotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.eni.filmotech.bo.Movie;

/**
 * @author gaeta
 *
 */
@Controller
public class SearchController {
	
	@GetMapping("/rechercher")
	public String searchController(@ModelAttribute("movie")Movie movie){
		return "search";
	}

}
