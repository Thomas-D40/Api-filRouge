package fr.m2i.apicrm.service;

import fr.m2i.apicrm.entity.Order;
import fr.m2i.apicrm.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).get();
    }
    
    public void addOrder(Order order) {
        orderRepository.save(order);
    }
    
    public void updateOrder(Order order) {
       if (orderRepository.existsById(order.getId())) {
           orderRepository.save(order);
       }
    }
    
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}
