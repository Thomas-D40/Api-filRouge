package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.DTO.OrderDTO;
import fr.m2i.apicrm.DTO.OrderMapper;
import fr.m2i.apicrm.entity.Order;

import fr.m2i.apicrm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<OrderDTO> getOrders() {
        
        List<Order> orders = service.getAllOrders();
        List<OrderDTO> ordersDTO = new ArrayList<>();
        for (Order order: orders) {
            ordersDTO.add(OrderMapper.buildOrderDTO(order));
        }
        return ordersDTO;
    }
    
    @GetMapping("/{id}")
    public OrderDTO getOrderById(@PathVariable Long id) {
        return OrderMapper.buildOrderDTO(service.getOrderById(id));
    }
    
    @PostMapping
    public void createOrder(@RequestBody OrderDTO orderDTO) {
        service.addOrder(OrderMapper.buildOrder(orderDTO));
    }
    
    @PutMapping("/{id}")
    public @ResponseBody String updateOrder(@RequestBody OrderDTO orderDTO) {
        service.addOrder(OrderMapper.buildOrder(orderDTO));
        return "Mise à jour effectuée";
    }
    
    @DeleteMapping("/{id}")
    public @ResponseBody String deleteOrder(@PathVariable("id") Long id) {
        service.deleteOrderById(id);
        return "Suppression effectuée";
    }
}
