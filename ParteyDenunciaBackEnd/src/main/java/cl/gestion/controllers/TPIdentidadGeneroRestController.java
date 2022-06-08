package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPIdentidadGenero;
import cl.gestion.models.services.ITPIdentidadGeneroServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPIdentidadGeneroRestController {
	
	@Autowired
	private ITPIdentidadGeneroServices tpIdentidadGeneroServices;
	
	@GetMapping("/tipos-identidad-genero")
	public List<TPIdentidadGenero> findAll(){
		return tpIdentidadGeneroServices.findAll();
	}
}
