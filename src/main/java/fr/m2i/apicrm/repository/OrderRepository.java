package fr.m2i.apicrm.repository;

import fr.m2i.apicrm.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface OrderRepository extends JpaRepository<Order, Long> {
	public List<Order> findAllByTypePresta(String typePresta);
}
