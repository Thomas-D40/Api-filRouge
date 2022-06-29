package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.entity.Order;

import fr.m2i.apicrm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }
    
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }
    
    @PostMapping
    public void createOrder(@RequestBody Order order) {
        service.addOrder(order);
    }
    
    @PutMapping("/{id}")
    public @ResponseBody String updateOrder(@RequestBody Order order) {
        service.updateOrder(order);
        return "Mise à jour effectuée";
    }
    
    @DeleteMapping("/{id}")
    public @ResponseBody String deleteOrder(@PathVariable("id") Long id) {
        service.deleteOrderById(id);
        return "Suppression effectuée";
    }
}
