package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPDocumento;
import cl.gestion.models.services.ITPDocumentoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPDocumentoRestController {
	
	@Autowired
	private ITPDocumentoServices tpDocumentoServices;
	
	@GetMapping("/tipos-documento")
	public List<TPDocumento> findAll(){
		return tpDocumentoServices.findAll();
	}

}
