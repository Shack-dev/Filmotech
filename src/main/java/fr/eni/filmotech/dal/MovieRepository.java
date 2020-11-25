/**
 * 
 */
package fr.eni.filmotech.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.filmotech.bo.Movie;

/**
 * @author gaeta
 *
 */
public interface MovieRepository extends CrudRepository<Movie, Integer> {
	
	

}
