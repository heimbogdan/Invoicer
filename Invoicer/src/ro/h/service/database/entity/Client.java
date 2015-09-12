package ro.h.service.database.entity;

import java.math.BigDecimal;

public class Client {

	private int id;
	private String clientId;
	private String firstName;
	private String lastName;
	private BigDecimal cnp;
	private String address;
	private String phoneNo1;
	private String phoneNo2;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigDecimal getCnp() {
		return cnp;
	}
	public void setCnp(BigDecimal cnp) {
		this.cnp = cnp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo1() {
		return phoneNo1;
	}
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}
	public String getPhoneNo2() {
		return phoneNo2;
	}
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Client(String clientId, String firstName, String lastName, BigDecimal cnp, 
			String address, String phoneNo1, String phoneNo2, String email) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cnp = cnp;
		this.address = address;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.email = email;
	}
	
	public Client(){
		
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", clientId=" + clientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", cnp=" + cnp + ", address=" + address + ", phoneNo1=" + phoneNo1 + ", phoneNo2=" + phoneNo2
				+ ", email=" + email + "]";
	}
	
}
