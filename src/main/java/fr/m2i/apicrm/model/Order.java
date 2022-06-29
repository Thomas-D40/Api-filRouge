package fr.m2i.apicrm.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@ManyToOne
	@JoinColumn(name = "clientId")
	private Client client;
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
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
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
		final StringBuilder sb = new StringBuilder("Order{");
		sb.append("id=").append(id);
		sb.append(", client=").append(client);
		sb.append(", typePresta='").append(typePresta).append('\'');
		sb.append(", designation='").append(designation).append('\'');
		sb.append(", nbDays=").append(nbDays);
		sb.append(", unitPrice=").append(unitPrice);
		sb.append(", state=").append(state);
		sb.append('}');
		return sb.toString();
	}
}
