package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.Denuncia;
import cl.gestion.models.services.IDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DenunciaRestController {
	
	@Autowired
	private IDenunciaServices denunciaServices;
	
	@PostMapping("/denuncia")
	@ResponseStatus(HttpStatus.CREATED)
	public Denuncia Create(@RequestBody Denuncia denuncia)
	{				
		return denunciaServices.save(denuncia);
	}
}
