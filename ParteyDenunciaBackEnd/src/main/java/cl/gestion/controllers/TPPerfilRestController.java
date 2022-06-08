package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPPerfil;
import cl.gestion.models.services.ITPPerfilServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPPerfilRestController {

	@Autowired
	private ITPPerfilServices tpPerfilServices;
	
	@GetMapping("/tipos-perfil")
	public List<TPPerfil> findAll(){
		return tpPerfilServices.findAll();
	}
}
