package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.DTO.ClientDTO;
import fr.m2i.apicrm.DTO.ClientMapper;
import fr.m2i.apicrm.entity.Client;
import fr.m2i.apicrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public List<ClientDTO> getAll() {
		List<Client> clients = service.getAllClients();
		List<ClientDTO> clientsDTO = new ArrayList<>();
		for (Client client:clients) {
			clientsDTO.add(ClientMapper.buildClientDTO(client));
		}
		return clientsDTO;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> getClientById(@PathVariable Long id) {
		Optional<Client> clientOptional = service.getClientById(id);
		if (clientOptional.isPresent()) {
			Client client = clientOptional.get();
			
			return ResponseEntity.status(200).body(ClientMapper.buildClientDTO(client));
			
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@PostMapping
	public @ResponseBody String addClient(@RequestBody ClientDTO clientDTO) {
		Client client = ClientMapper.buildClient(clientDTO);
		service.addClient(client);
		return "Ajout du client effectué";
	}
	
	@PutMapping("/{id}")
	public @ResponseBody String updateClient(@RequestBody ClientDTO clientDTO) {
		Client client = ClientMapper.buildClient(clientDTO);
		service.updateClient(client);
		return "Mise à jour effectuée";
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody String deleteClientById(@PathVariable Long id) {
		service.deleteClientById(id);
		return "Suppression effectuée";
	}
}
