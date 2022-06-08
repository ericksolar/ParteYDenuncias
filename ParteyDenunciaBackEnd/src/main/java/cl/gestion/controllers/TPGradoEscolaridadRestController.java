package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPGradoEscolaridad;
import cl.gestion.models.services.ITPGradoEscolaridadServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPGradoEscolaridadRestController {
	
	@Autowired
	private ITPGradoEscolaridadServices tpGradoEscolaridadServices;
	
	@GetMapping("/tipos-grado-escolaridad")
	public List<TPGradoEscolaridad> findAll(){
		return tpGradoEscolaridadServices.findAll();
	}
}
