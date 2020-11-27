package fr.eni.filmotech.services;

import java.util.List;

import fr.eni.filmotech.bo.Member;

public interface MembreService {
	
	Member trouverMembre(String username, String password);
	
}
