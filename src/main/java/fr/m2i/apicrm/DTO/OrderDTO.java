package fr.m2i.apicrm.DTO;

import fr.m2i.apicrm.entity.Client;

import javax.persistence.*;

public class OrderDTO {
	
	
	private Long id;
	private ClientDTO client;
	private String typePresta;
	private String designation;
	private int nbDays;
	private float unitPrice;
	private String state;
	
	public OrderDTO() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public ClientDTO getClientDTO() {
		return client;
	}
	
	public void setClient(ClientDTO clientDTO) {
		this.client = clientDTO;
	}
}
