/**
 * 
 */
package fr.eni.filmotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gaeta
 *
 */
@Controller
public class SearchController {
	
	@GetMapping("/rechercher")
	public String searchController(){
		return "search";
	}
	
	

}
