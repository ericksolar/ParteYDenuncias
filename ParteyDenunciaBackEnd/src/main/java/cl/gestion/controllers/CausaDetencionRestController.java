package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.CausaDetencion;
import cl.gestion.models.services.ICausaDetencionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class CausaDetencionRestController {
	
	@Autowired
	private ICausaDetencionServices causaDetencionServices;
	
	@PostMapping("/causa-detencion")
	@ResponseStatus(HttpStatus.CREATED)
	public CausaDetencion Create(@RequestBody CausaDetencion causaDetencion)
	{				
		return causaDetencionServices.save(causaDetencion);
	}
}
