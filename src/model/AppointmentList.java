package model;

import java.util.Date;
import java.util.List;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 3, 2021
 */
public class AppointmentList {
	private int id;
	private Customer customer;
	private Date visitDate;
	private List<Pet> petsList;

	/**
	 * 
	 */
	public AppointmentList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public List<Pet> getPetsList() {
		return petsList;
	}

	public void setPetsList(List<Pet> petsList) {
		this.petsList = petsList;
	}

	/**
	 * @param customer
	 * @param visitDate
	 * @param petsList
	 */
	public AppointmentList(Customer customer, Date visitDate, List<Pet> petsList) {
		super();
		this.customer = customer;
		this.visitDate = visitDate;
		this.petsList = petsList;
	}

	/**
	 * @param id
	 * @param customer
	 * @param visitDate
	 * @param petsList
	 */
	public AppointmentList(int id, Customer customer, Date visitDate, List<Pet> petsList) {
		super();
		this.id = id;
		this.customer = customer;
		this.visitDate = visitDate;
		this.petsList = petsList;
	}

	@Override
	public String toString() {
		return "AppointmentList [id=" + id + ", customer=" + customer + ", visitDate=" + visitDate + ", petsList="
				+ petsList + "]";
	}
	

}
