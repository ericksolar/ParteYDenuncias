package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPRolImputado;
import cl.gestion.models.services.ITPRolImputadoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPRolImputadoRestController {
	
	@Autowired
	private ITPRolImputadoServices tpRolImputadoServices;
	
	@GetMapping("/tipos-rol-imputado")
	public List<TPRolImputado> findAll(){
		return tpRolImputadoServices.findAll();
	}
	
}
