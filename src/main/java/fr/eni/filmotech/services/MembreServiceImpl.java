package fr.eni.filmotech.services;

import org.springframework.stereotype.Service;

import fr.eni.filmotech.bo.Member;
import fr.eni.filmotech.dal.MembreRepository;

@Service
public class MembreServiceImpl implements MembreService {
	
	private MembreRepository repo;
	
	public MembreServiceImpl(MembreRepository repo) {
		this.repo = repo;
	}

	@Override
	public Member trouverMembre(String username, String password) {
		return (Member) repo.findByUsernameAndPassword(username, password);
	}

}
