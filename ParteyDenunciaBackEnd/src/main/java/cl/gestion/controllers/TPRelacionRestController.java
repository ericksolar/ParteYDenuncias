package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPRelacion;
import cl.gestion.models.services.ITPRelacionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPRelacionRestController {
	
	@Autowired
	private ITPRelacionServices tpRelacionServices;
	
	@GetMapping("/tipos-relacion")
	public List<TPRelacion> findAll(){
		return tpRelacionServices.findAll();
	}
}
