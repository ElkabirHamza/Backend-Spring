package spring.ateliers.g2.atelier1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.ateliers.g2.atelier1.model.Client;
import spring.ateliers.g2.atelier1.repository.ClientRepository;

@RestController
@RequestMapping("/home")
public class ClientsController {
	@Autowired
	ClientRepository clientRepository;
	
	
	 @GetMapping("/all")
	    public List<Client> getClients() {
	        return clientRepository.findAll();
	    }
	 	@CrossOrigin
	    @PostMapping("/add")
	    public String createClient(@RequestBody Client client) {
	    	clientRepository.save(client);
	        return "OK";
	    }

}
