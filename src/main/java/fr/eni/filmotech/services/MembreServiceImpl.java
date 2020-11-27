package fr.eni.filmotech.services;

import org.springframework.stereotype.Service;

import fr.eni.filmotech.bo.Member;
import fr.eni.filmotech.dal.MemberDao;

@Service
public class MembreServiceImpl implements MembreService {
	
	private MemberDao dao;
	
	public MembreServiceImpl(MemberDao dao) {
		this.dao = dao;
	}

	@Override
	public Member trouverMembre(String username, String password) {
		return dao.connexion(username, password);
	}

}
