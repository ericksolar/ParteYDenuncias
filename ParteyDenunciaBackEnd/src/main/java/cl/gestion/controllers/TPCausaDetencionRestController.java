package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPCausaDetencion;
import cl.gestion.models.services.ITPCausaDetencionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPCausaDetencionRestController {
	
	@Autowired
	private ITPCausaDetencionServices tpCausaDetencionServices;
	
	@GetMapping("/tipos-causa-detencion")
	public List<TPCausaDetencion> findAll(){
		return tpCausaDetencionServices.findAll();
	}
}
