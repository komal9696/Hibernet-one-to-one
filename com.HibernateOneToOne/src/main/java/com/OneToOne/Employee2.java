
package com.OneToOne;

	
		import javax.persistence.*;  
		  
		@Entity  
		@Table(name="employee2")  
		public class Employee2 {    
		      
		    @Id  
		    @GeneratedValue(strategy=GenerationType.AUTO)  
		    @PrimaryKeyJoinColumn  
		private int employeeId;    
		private String name,email;    
		@OneToOne(targetEntity=Address2.class,cascade=CascadeType.ALL)  
		private Address2 address;  
		public int getEmployeeId() {  
		    return employeeId;  
		}  
		public void setEmployeeId(int employeeId) {  
		    this.employeeId = employeeId;  
		}  
		public String getName() {  
		    return name;  
		}  
		public void setName(String name) {  
		    this.name = name;  
		}  
		public String getEmail() {  
		    return email;  
		}  
		public void setEmail(String email) {  
		    this.email = email;  
		}  
		public Address2 getAddress() {  
		    return address;  
		}  
		public void setAddress(Address2 address) {  
		    this.address = address;  
		}    
		  
		}  