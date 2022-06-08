package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPInvolucrado;
import cl.gestion.models.services.ITPInvolucradoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPInvolucradoRestController {
	
	@Autowired
	private ITPInvolucradoServices tpInvolucradoServices;
	
	@GetMapping("/tipos-involucrado")
	public List<TPInvolucrado> findAll(){
		return tpInvolucradoServices.findAll();
	}
}
