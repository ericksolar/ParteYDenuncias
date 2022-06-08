package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPContactoDenuncia;
import cl.gestion.models.services.ITPContactoDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPContactoDenunciaRestController {
	
	@Autowired
	private ITPContactoDenunciaServices tpContactoDenunciaServices;
	
	@GetMapping("/tipos-contacto-denuncia")
	public List<TPContactoDenuncia> findAll(){
		return tpContactoDenunciaServices.findAll();
	}
}
