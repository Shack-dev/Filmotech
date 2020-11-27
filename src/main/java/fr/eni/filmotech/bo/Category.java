/**
 * 
 */
package fr.eni.filmotech.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author gaeta
 *
 */
@Entity
public class Category {
	
	//attribut
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToMany(mappedBy = "category" )
	private List<Movie> movieId;

	//Constructor
	
	public Category() {
		super();
	}
	
	public Category(int id, String name, List<Movie> movieId) {
		super();
		this.id = id;
		this.name = name;
		this.movieId = movieId;
	}



	//Getters and setters

	/**
	 * Retourne l'id de la categorie.
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retrourne le nom de la catégorie
	 * @return category
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ajoute le nom d'une catégorie
	 * @param category
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public List<Movie> getMovieId() {
		return movieId;
	}

	/**
	 * 
	 * @param movieId
	 */
	public void setUserId(List<Movie> movieId) {
		this.movieId = movieId;
	}
	
	

}
