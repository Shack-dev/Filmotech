/**
 * 
 */
package fr.eni.filmotech.service;

import java.util.Optional;

import fr.eni.filmotech.bo.Movie;

/**
 * @author gaeta
 *
 */
public interface MovieService {
	
	public Optional<Movie> findMovie();

}
