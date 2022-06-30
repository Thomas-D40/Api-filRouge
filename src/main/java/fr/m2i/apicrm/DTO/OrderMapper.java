package fr.m2i.apicrm.DTO;

import fr.m2i.apicrm.controller.ClientController;
import fr.m2i.apicrm.entity.Client;
import fr.m2i.apicrm.entity.Order;

public class OrderMapper {
	
	public static OrderDTO buildOrderDTO(Order order) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setId(order.getId());
		orderDTO.setClient(ClientMapper.buildClientDTO(order.getClient()));
		orderDTO.setTypePresta(order.getTypePresta());
		orderDTO.setDesignation(order.getDesignation());
		orderDTO.setNbDays(order.getNbDays());
		orderDTO.setUnitPrice(order.getUnitPrice());
		switch (order.getState()) {
			case 0 :
				orderDTO.setState("CANCELLED");
			case 1 :
				orderDTO.setState("OPTION");
				break;
			case 2 :
				orderDTO.setState("CONFIRMED");
				break;
		}
		
		return orderDTO;

	}
	
	public static Order buildOrder(OrderDTO orderDTO, Client client) {
		Order order = new Order();
		order.setId(orderDTO.getId());
		order.setTypePresta(orderDTO.getTypePresta());
		order.setDesignation(orderDTO.getDesignation());
		order.setNbDays(orderDTO.getNbDays());
		order.setUnitPrice(orderDTO.getUnitPrice());
		switch (orderDTO.getState()) {
			case "CANCELLED" :
				order.setState(0);
			case "OPTION" :
				order.setState(1);
				break;
			case "CONFIRMED" :
				order.setState(2);
				break;
		}
		
		
		order.setClient(client);
		
		return order;
	}
}
