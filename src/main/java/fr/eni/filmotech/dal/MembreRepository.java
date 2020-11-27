package fr.eni.filmotech.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotech.bo.Member;

/**
 * Interface qui va contenir toutes les fonctions relatives à la manipulation des utilisateurs.
 * @author Anthony MARTIN
 *
 */
public interface MembreRepository extends JpaRepository<Member, Long> {
	
	Member findByUsernameAndPassword(String username, String password);
	
}
