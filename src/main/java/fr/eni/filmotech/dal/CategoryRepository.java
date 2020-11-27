/**
 * 
 */
package fr.eni.filmotech.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.filmotech.bo.Category;

/**
 * @author gaeta
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
