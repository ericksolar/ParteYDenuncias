package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPResidencia;
import cl.gestion.models.services.ITPResidenciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPResidenciaRestController {
	
	@Autowired
	private ITPResidenciaServices tpResidenciaServices;
	
	@GetMapping("/tipos-residencia")
	public List<TPResidencia> findAll(){
		return tpResidenciaServices.findAll();
	}
}
