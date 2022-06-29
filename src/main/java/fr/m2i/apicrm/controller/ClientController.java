package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.model.Client;
import fr.m2i.apicrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public List<Client> getAll() {
		return service.getAllClients();
	}
	
	@GetMapping("/{id}")
	public Client getClientById(@PathVariable Long id) {
		return service.getClientById(id);
	}
	
	@PostMapping
	public @ResponseBody String addClient(@RequestBody Client client) {
		service.addClient(client);
		return "Ajout du client effectué";
	}
	
	@PutMapping("/{id}")
	public @ResponseBody String updateClient(@RequestBody Client client) {
		service.updateClient(client);
		return "Mise à jour effectuée";
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody String deleteClientById(@PathVariable Long id) {
		service.deleteClientById(id);
		return "Suppression effectuée";
	}
}
