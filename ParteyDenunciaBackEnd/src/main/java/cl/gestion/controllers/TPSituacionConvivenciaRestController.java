package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPSituacionConvivencia;
import cl.gestion.models.services.ITPSituacionConvivenciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPSituacionConvivenciaRestController {
	
	@Autowired
	private ITPSituacionConvivenciaServices tpSituacionConvivenciaServices;
	
	@GetMapping("/tipos-situacion-convivencia")
	public List<TPSituacionConvivencia> findAll(){
		return tpSituacionConvivenciaServices.findAll();
	}
}
