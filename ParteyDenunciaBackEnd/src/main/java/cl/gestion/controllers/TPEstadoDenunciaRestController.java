package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPEstadoDenuncia;
import cl.gestion.models.services.ITPEstadoDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPEstadoDenunciaRestController {
	
	@Autowired
	private ITPEstadoDenunciaServices tpEstadoDenunciaServices;
	
	@GetMapping("/tipos-estado-denuncia")
	public List<TPEstadoDenuncia> findAll(){
		return tpEstadoDenunciaServices.findAll();
	}
}
