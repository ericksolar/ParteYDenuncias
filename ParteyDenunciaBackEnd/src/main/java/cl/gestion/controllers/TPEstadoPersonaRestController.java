package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPEstadoPersona;
import cl.gestion.models.services.ITPEstadoPersonaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPEstadoPersonaRestController {
	
	@Autowired
	private ITPEstadoPersonaServices tpEstadoPersonaServices;
	
	@GetMapping("/tipos-estado-persona")
	public List<TPEstadoPersona> findAll(){
		return tpEstadoPersonaServices.findAll();
	}
}
