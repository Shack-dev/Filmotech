/**
 * 
 */
package fr.eni.filmotech.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.filmotech.bo.Category;
import fr.eni.filmotech.dal.CategoryRepository;

/**
 * @author gaeta
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	private CategoryRepository catDao;
	
	public CategoryServiceImpl(CategoryRepository catDao) {
		this.catDao = catDao;
	}

	@Override
	public Map<Integer, String> mappingCategory() {
		
		Map<Integer, String> catMap = new HashMap<>(); 

		 for (Category category : catDao.findAll()) { 
			 catMap.put(category.getId(), category.getName());
		 };
		
		return catMap;
	}
	
}
