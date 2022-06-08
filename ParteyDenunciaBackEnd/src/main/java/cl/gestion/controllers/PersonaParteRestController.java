package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.PersonaParte;
import cl.gestion.models.services.IPersonaParteServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class PersonaParteRestController {
	
	@Autowired
	private IPersonaParteServices personaParteServices;
	
	@PostMapping("/persona-parte")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaParte Create(@RequestBody PersonaParte personaParte)
	{				
		return personaParteServices.save(personaParte);
	}
}
