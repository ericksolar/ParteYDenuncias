package cl.gestion.controllers;

import java.util.List;

import cl.gestion.models.entity.TPConduccion;
import cl.gestion.models.services.ITPConduccionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPConduccionRestController {
	
	@Autowired
	private ITPConduccionServices tpConduccionServices;
	
	@GetMapping("/tpconduccion")
	public List<TPConduccion> findAll(){
		return tpConduccionServices.findAll();
	}
}
