package fr.eni.filmotech.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;


/**
 * @author Anthony MARTIN
 * 
 * Classe qui définit les utilisateurs de l'appli
 */
@Entity
@Table(name="members")

@NamedQueries({
	@NamedQuery (name = "userLogin",
				query = "SELECT m FROM Member m WHERE m.username LIKE :username AND m.password LIKE :password")
	})
public class Member  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long 	member_id;
	@NotNull
	public String 	username;
	public String 	firstname;
	public String 	lastname;
	public Date 	creationDate;
	@NotNull
	public String 	password;
	public Boolean 	isAdmin;
	
	
	/**
	 * Constructeur par défaut, vide.
	 */
	public Member() {
		
	}
	
	/**
	 * Constructeur avec tous les détails pour créer un membre. La date de création de l'utilisateur est automatiquement celle du jour.
	 * @param username - Son pseudo
	 * @param firstname - Son prénom
	 * @param lastname - Son nom
	 * @param password - Son mot de passe
	 * @param isAdmin - Si ce user est un admin ou non
	 */
	public Member(String username, String firstname, String lastname, String password, Boolean isAdmin) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.creationDate = new Date();
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
//////////////////////
// Getters et setters
	
	public Long getMember_id() {
		return member_id;
	}
	
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "member [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", creationDate=" + creationDate + ", password=" + password + ", isAdmin=" + isAdmin + "]";
	}
	
	
	
	
	


}
