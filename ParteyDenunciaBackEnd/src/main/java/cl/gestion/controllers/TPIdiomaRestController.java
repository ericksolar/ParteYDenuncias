package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPIdioma;
import cl.gestion.models.services.ITPIdiomaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPIdiomaRestController {
	
	@Autowired
	private ITPIdiomaServices tpIdiomaServices;
	
	@GetMapping("/tipos-idioma")
	public List<TPIdioma> findAll(){
		return tpIdiomaServices.findAll();
	}
}
