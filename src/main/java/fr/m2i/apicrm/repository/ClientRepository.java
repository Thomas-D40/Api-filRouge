package fr.m2i.apicrm.repository;

import fr.m2i.apicrm.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
