package fr.eni.filmotech.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.eni.filmotech.bo.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	private EntityManagerFactory emf;
	
	@PersistenceUnit
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public Member connexion(String username, String password) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Member> query = em.createNamedQuery("userLogin", Member.class);
		return query.setParameter("username", username).setParameter("password", password).getSingleResult();
	}



}
