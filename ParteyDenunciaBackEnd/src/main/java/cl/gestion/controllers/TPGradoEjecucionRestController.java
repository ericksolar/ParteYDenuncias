package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPGradoEjecucion;
import cl.gestion.models.services.ITPGradoEjecucionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPGradoEjecucionRestController {
	
	@Autowired
	private ITPGradoEjecucionServices tpGradoEjecucionServices;
	
	@GetMapping("/tipos-grado-ejecucion")
	public List<TPGradoEjecucion> findAll(){
		return tpGradoEjecucionServices.findAll();
	}
}
