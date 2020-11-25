/**
 * 
 */
package fr.eni.filmotech.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Objet permettant la gestion des films.
 * @author gaeta
 *
 */
@Entity
public class Movie {
	
	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String issueDate;
	
	private String pictureLink;
	
	private int categoryId;
	
	private int creatorId;
	
	//Constructor
	
	public Movie() {
		super();
	}

	public Movie(int id, String name, String issueDate, String pictureLink, int categoryId, int creatorId) {
		super();
		this.id = id;
		this.name = name;
		this.issueDate = issueDate;
		this.pictureLink = pictureLink;
		this.categoryId = categoryId;
		this.creatorId = creatorId;
	}
	
	//setters getters
	
	/**
	 * Retourne l'id du film
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Ajoute l'id, généré automatiquement.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retourne le nom du film
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ajoute le nom d'un film
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retourne l'année de sortie d'un film
	 * @return issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * Ajoute l'année de sortie d'un film
	 * @param issueDate
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * retourne le lien pour affichage de l'affiche du film.
	 * @return pictureLink
	 */
	public String getPictureLink() {
		return pictureLink;
	}

	/**
	 * Ajoute l'url de stockage de l'affiche du film.
	 * @param pictureLink
	 */
	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}

	/**
	 * retourne l'id de la catégorie du film.
	 * @return categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * Ajoute l'id d'une catégorie associée.
	 * @param categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Retourne l'id de l'utilisateur créateur de la fiche du film.
	 * @return getCreatorId
	 */
	public int getCreatorId() {
		return creatorId;
	}

	/**
	 * Ajoute l'id de l'utilisateur créateur de la fiche du film.
	 * @param creatorId
	 */
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	//to string
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", issueDate=" + issueDate + ", pictureLink=" + pictureLink
				+ ", categoryId=" + categoryId + ", creatorId=" + creatorId + "]";
	}

}
