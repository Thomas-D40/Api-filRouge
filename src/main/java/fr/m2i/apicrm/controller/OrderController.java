package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.entity.Order;

import fr.m2i.apicrm.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderServiceInterface service;

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }
}
