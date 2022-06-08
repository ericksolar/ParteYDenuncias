package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPLugarOcurrencia;
import cl.gestion.models.services.ITPLugarOcurrenciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPLugarOcurrenciaRestController {
	
	@Autowired
	private ITPLugarOcurrenciaServices tpLugarOcurrenciaServices;
	
	@GetMapping("/tipos-lugar-ocurrencia")
	public List<TPLugarOcurrencia> findAll(){
		return tpLugarOcurrenciaServices.findAll();
	}
}
