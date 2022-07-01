package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.Delito;
import cl.gestion.models.services.IDelitoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DelitoRestController {
	
	@Autowired
	private IDelitoServices delitoServices;
	
	@GetMapping("/delito")
	public List<Delito> findAll(){
		return delitoServices.findAll();
	}
	
	@PostMapping("/delito")
	@ResponseStatus(HttpStatus.CREATED)
	public Delito Create(@RequestBody Delito delito)
	{				
		return delitoServices.save(delito);
	}
}
