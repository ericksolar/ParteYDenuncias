package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.InvolucradoDenunciado;
import cl.gestion.models.services.IInvolucradoDenunciadoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class InvolucradoDenunciadoRestController {
	
	@Autowired
	private IInvolucradoDenunciadoServices involucradoDenunciadoServices;
	
	@PostMapping("/involucrado-denunciado")
	@ResponseStatus(HttpStatus.CREATED)
	public InvolucradoDenunciado Create(@RequestBody InvolucradoDenunciado involucradoDenunciado)
	{				
		return involucradoDenunciadoServices.save(involucradoDenunciado);
	}
}
