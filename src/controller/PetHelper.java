package controller;
import java.util.List;

import javax.persistence.*;

import model.Pet;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 7, 2021
 */
public class PetHelper {
	static
	EntityManagerFactory emfactory =
	Persistence.createEntityManagerFactory("PetList");

	public void insertItem(Pet pet) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(pet);
		em.getTransaction().commit();
		em.close();
		
	}

}
