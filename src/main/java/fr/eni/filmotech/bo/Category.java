/**
 * 
 */
package fr.eni.filmotech.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	//Constructor
	
	public Category() {
		super();
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
