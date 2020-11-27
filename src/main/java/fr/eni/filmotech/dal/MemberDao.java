package fr.eni.filmotech.dal;

import fr.eni.filmotech.bo.Member;

public interface MemberDao {
	
	Member connexion(String username, String password);

}
