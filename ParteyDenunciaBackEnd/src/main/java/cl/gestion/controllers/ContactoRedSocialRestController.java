package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.ContactoRedSocial;
import cl.gestion.models.services.IContactoRedSocialServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class ContactoRedSocialRestController {
	
	@Autowired
	private IContactoRedSocialServices contactoRedSocialServices;
	
	@PostMapping("/contacto-red-social")
	@ResponseStatus(HttpStatus.CREATED)
	public ContactoRedSocial Create(@RequestBody ContactoRedSocial contactoRedSocial)
	{				
		return contactoRedSocialServices.save(contactoRedSocial);
	}
}
