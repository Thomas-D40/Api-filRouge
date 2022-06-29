package fr.m2i.apicrm.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "clientId")
	private int clientId;
	@Column(name = "typePresta")
	private String typePresta;
	@Column(name = "designation")
	private String designation;
	@Column(name = "nbDays")
	private int nbDays;
	@Column(name = "unitPrice")
	private float unitPrice;
	@Column(name = "state")
	private int state;
	
	public Order() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getClientId() {
		return clientId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public String getTypePresta() {
		return typePresta;
	}
	
	public void setTypePresta(String typePresta) {
		this.typePresta = typePresta;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public int getNbDays() {
		return nbDays;
	}
	
	public void setNbDays(int nbDays) {
		this.nbDays = nbDays;
	}
	
	public float getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", clientId=" + clientId +
				", typePresta='" + typePresta + '\'' +
				", designation='" + designation + '\'' +
				", nbDays=" + nbDays +
				", unitPrice=" + unitPrice +
				", state=" + state +
				'}';
	}
}
