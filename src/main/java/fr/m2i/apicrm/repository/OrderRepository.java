package fr.m2i.apicrm.repository;

import fr.m2i.apicrm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer> {
}
