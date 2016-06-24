package fr.treeptik.springsample.service;

import fr.treeptik.springsample.dao.PersonneDAO;
import fr.treeptik.springsample.model.Personne;

public class PersonneServiceImpl implements PersonneService {

	private PersonneDAO personneDAO;

	public PersonneServiceImpl() {
	}

	public PersonneServiceImpl(PersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

	public void init() {
		System.out.println("Methode d'initialisation");
	}

	public void destroy() {
		System.out.println("Methode de destruction");
	}

	@Override
	public void save(Personne personne) {
		personneDAO.save(personne);
	}

	public PersonneDAO getPersonneDAO() {
		return personneDAO;
	}

	public void setPersonneDAO(PersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

}
