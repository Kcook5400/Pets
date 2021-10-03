package model;

import java.util.Date;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 3, 2021
 */
public class Pet {
	
	private String petName;
	private Date visitDate;
	private String petType;
	
	
	
	/**
	 * 
	 */
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param petName
	 * @param visitDate
	 * @param petType
	 */
	public Pet(String petName, Date visitDate, String petType) {
		super();
		this.petName = petName;
		this.visitDate = visitDate;
		this.petType = petType;
	}
	
	
	
	
	

}
