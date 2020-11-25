/**
 * 
 */
package fr.eni.filmotech.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.eni.filmotech.bo.Movie;
import fr.eni.filmotech.dal.MovieRepository;

/**
 * @author gaeta
 *
 */
@Service
public class MovieServiceImpl implements MovieService {
	
	private MovieRepository movieDao;

	public MovieServiceImpl(MovieRepository movieDao) {
		this.movieDao = movieDao;
	}
	
	@Override
	public Optional<Movie> findMovie() {	
		return movieDao.findById(1);
	}
}
