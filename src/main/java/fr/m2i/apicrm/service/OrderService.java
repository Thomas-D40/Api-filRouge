package fr.m2i.apicrm.service;

import fr.m2i.apicrm.model.Order;
import fr.m2i.apicrm.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;


    public List<Order> getAllOrders() {
        return repository.findAll();
    }
    
    public Order getOrderById(Long id) {
        return repository.findById(id).get();
    }
    
    public void addOrder(Order order) {
        repository.save(order);
    }
    
    public void updateOrder(Order order) {
        repository.save(order);
    }
    
    public void deleteOrderById(Long id) {
        repository.deleteById(id);
    }
}
