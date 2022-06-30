package fr.m2i.apicrm.service;

import fr.m2i.apicrm.entity.Client;
import fr.m2i.apicrm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> getAllClients() {
		return repository.findAll();
	}
	
	public Optional<Client> getClientById(Long id) {
		return repository.findById(id);
	}
	
	
	
	public void addClient(Client client) {
		repository.save(client);
	}
	
	public void updateClient(Client client) {
		if (repository.existsById(client.getId())) {
			repository.save(client);
		}
	}
	
	public void deleteClientById(Long id) {
		repository.deleteById(id);
	}
}
