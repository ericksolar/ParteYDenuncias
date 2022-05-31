package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPSituacionDenuncia;
import cl.gestion.models.services.ITPSituacionDenunciaServices;



@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPSituacionDenunciaRestController {
	
	@Autowired
	private ITPSituacionDenunciaServices tpSituacionDenunciaServices;
	
	@GetMapping("/tpsituaciondenuncia")
	public List<TPSituacionDenuncia> findAll(){
		return tpSituacionDenunciaServices.findAll();
	}
}
