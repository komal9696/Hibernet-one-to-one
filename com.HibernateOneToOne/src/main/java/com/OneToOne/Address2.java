package com.OneToOne;


	import javax.persistence.*;  
	  
	@Entity  
	@Table(name="Address2")  
	public class Address2 {    
	      
	    @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int addressId;    
	private String addressLine1,city,state,country;    
	private int pincode;    
	  
	@OneToOne(targetEntity=Employee2.class)  
	private Employee2 employee;  
	public int getAddressId() {  
	    return addressId;  
	}  
	public void setAddressId(int addressId) {  
	    this.addressId = addressId;  
	}  
	public String getAddressLine1() {  
	    return addressLine1;  
	}  
	public void setAddressLine1(String addressLine1) {  
	    this.addressLine1 = addressLine1;  
	}  
	public String getCity() {  
	    return city;  
	}  
	public void setCity(String city) {  
	    this.city = city;  
	}  
	public String getState() {  
	    return state;  
	}  
	public void setState(String state) {  
	    this.state = state;  
	}  
	public String getCountry() {  
	    return country;  
	}  
	public void setCountry(String country) {  
	    this.country = country;  
	}  
	public int getPincode() {  
	    return pincode;  
	}  
	public void setPincode(int pincode) {  
	    this.pincode = pincode;  
	}  
	public Employee2 getEmployee() {  
	    return employee;  
	}  
	public void setEmployee(Employee2 employee) {  
	    this.employee = employee;  
	}    
	}  
	

	
	