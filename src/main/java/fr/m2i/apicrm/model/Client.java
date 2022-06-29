package fr.m2i.apicrm.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "companyName", length = 100)
	private String companyName;
	@Column(name = "firstName", length = 100)
	private String firstName;
	@Column(name = "lastName", length = 100)
	private String lastName;
	
	@Column(name = "email", length = 100)
	private String email;
	@Column(name = "phone", length = 15)
	private String phone;
	@Column(name = "address")
	private String address;
	@Column(name = "zipCode", length = 15)
	private String zipCode;
	@Column(name = "city", length = 15)
	private String city;
	@Column(name = "country", length = 15)
	private String country;
	@Column(name = "state")
	private int state;
	
	public Client() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Client{");
		sb.append("id=").append(id);
		sb.append(", companyName='").append(companyName).append('\'');
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append(", address='").append(address).append('\'');
		sb.append(", zipCode='").append(zipCode).append('\'');
		sb.append(", city='").append(city).append('\'');
		sb.append(", country='").append(country).append('\'');
		sb.append(", state=").append(state);
		sb.append('}');
		return sb.toString();
	}
}
