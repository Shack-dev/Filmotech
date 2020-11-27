/**
 * 
 */
package fr.eni.filmotech.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
	
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "")
	@JoinTable(
			name="movie_category",
			joinColumns=@JoinColumn(name="movie_id", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="category_id", referencedColumnName="id"))
	private List<Category> category;
	
	private int creatorId;
	
	//Constructor
	
	public Movie() {
		super();
	}
	
	public Movie(int id, String name, String issueDate, String pictureLink, List<Category> category, int creatorId) {
		super();
		this.id = id;
		this.name = name;
		this.issueDate = issueDate;
		this.pictureLink = pictureLink;
		this.category = category;
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
	 * Retourne une liste de catégories
	 * @return category
	 */
	public List<Category> getCategory() {
		return category;
	}

	/**
	 * Ajoute une catégorie dans une liste.
	 * @param category
	 */
	public void setCategory(List<Category> category) {
		this.category = category;
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
				+ ", category=" + category + ", creatorId=" + creatorId + "]";
	}

}
