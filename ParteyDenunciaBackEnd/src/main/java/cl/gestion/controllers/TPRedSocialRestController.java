package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPRedSocial;
import cl.gestion.models.services.ITPRedSocialServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPRedSocialRestController {
	
	@Autowired
	private ITPRedSocialServices tpRedSocialServices;
	
	@GetMapping("/tipos-red-social")
	public List<TPRedSocial> findAll(){
		return tpRedSocialServices.findAll();
	}
}