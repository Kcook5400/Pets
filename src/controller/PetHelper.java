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
	
	public List<Pet> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<Pet> allPets = em.createQuery("SELECT i FROM ListItem i").getResultList();
		return allPets;
	}
	public void deleteItem(Pet toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pet> typedQuery = em.createQuery("select p from Pet p where p.petName = :selectedpetName and p.visitDate = :selectedvisitDate",Pet.class);
		
		typedQuery.setParameter("selectedName", toDelete.getPetName());
		typedQuery.setParameter("selectedType", toDelete.getVisitDate());
		
		typedQuery.setMaxResults(1);
		
		ListItem result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		
	}
	/**
	 * @param idToEdit
	 * @return
	 */
	public ListItem searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListItem found = em.find(ListItem.class, idToEdit);
		em.close();
		return found;
	}
	/**
	 * @param toEdit
	 */
	public void updateItem(ListItem toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
		
	}
	/**
	 * @param storeName
	 * @return
	 */
	public List<ListItem> searchForItemByStore(String storeName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.store = :selectedStore", ListItem.class);
		typedQuery.setParameter("selectedStore", storeName);
		List<ListItem> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	/**
	 * @param itemName
	 * @return
	 */
	public List<ListItem> searchForItemByItem(String itemName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem> typedQuery = em.createQuery("select li from ListItem li where li.store = :selectedItem", ListItem.class);
		typedQuery.setParameter("selectedStore", itemName);
		List<ListItem> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public void cleanUp() {
		emfactory.close();

	}
	

}
