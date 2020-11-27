/**
 * 
 */
package fr.eni.filmotech.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.eni.filmotech.bo.Movie;
import fr.eni.filmotech.services.CategoryService;

/**
 * @author gaeta
 *
 */
@Controller
public class SearchController {
	
	private CategoryService categoryService;
	
	public SearchController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/rechercher")
	public String searchController(@ModelAttribute("movie")Movie movie, Map<Integer, String>catMap, Model model){
		
		catMap = categoryService.mappingCategory();
		model.addAttribute("category",catMap);
		
		return "search";
	}

}
