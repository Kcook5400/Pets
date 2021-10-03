package model;
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 3, 2021
 */
public class Customer {

	private int id;
	private String customerName;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param customerName
	 * @param visitDate
	 */
	public Customer(int id, String customerName) {
		super();
		this.id = id;
		this.customerName = customerName;
	}


	/**
	 * @param customerName
	 */
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + "]";
	}
	
	
	
	

}
