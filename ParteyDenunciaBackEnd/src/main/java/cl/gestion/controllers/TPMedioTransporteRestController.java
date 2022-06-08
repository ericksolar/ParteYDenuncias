package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPMedioTransporte;
import cl.gestion.models.services.ITPMedioTransporteServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPMedioTransporteRestController {
	
	@Autowired
	private ITPMedioTransporteServices tpMedioTransporteServices;
	
	@GetMapping("/tipos-medio-transporte")
	public List<TPMedioTransporte> findAll(){
		return tpMedioTransporteServices.findAll();
	}
}
