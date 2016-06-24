package fr.treeptik.springsample.dao;

import fr.treeptik.springsample.model.Personne;

public class PersonneJPADAO implements PersonneDAO {

	@Override
	public Personne save(Personne personne) {
		System.out.println("methode JPA");
		return null;
	}

}
