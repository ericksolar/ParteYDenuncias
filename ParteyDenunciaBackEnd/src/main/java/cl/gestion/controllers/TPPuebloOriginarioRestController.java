package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPPuebloOriginario;
import cl.gestion.models.services.ITPPuebloOriginarioServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPPuebloOriginarioRestController {
	
	@Autowired
	private ITPPuebloOriginarioServices tpPuebloOriginarioServices;
	
	@GetMapping("/tipos-pueblo-originario")
	public List<TPPuebloOriginario> findAll(){
		return tpPuebloOriginarioServices.findAll();
	}
}
