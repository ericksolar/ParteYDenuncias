package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.MedioTransporteInvolucrado;
import cl.gestion.models.services.IMedioTransporteInvolucradoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class MedioTransporteInvolucradoRestController {
	
	@Autowired
	private IMedioTransporteInvolucradoServices medioTransporteInvolucradoServices;
	
	@PostMapping("/medio-transporte-involucrado")
	@ResponseStatus(HttpStatus.CREATED)
	public MedioTransporteInvolucrado Create(@RequestBody MedioTransporteInvolucrado medioTransporteInvolucrado)
	{				
		return medioTransporteInvolucradoServices.save(medioTransporteInvolucrado);
	}
}
