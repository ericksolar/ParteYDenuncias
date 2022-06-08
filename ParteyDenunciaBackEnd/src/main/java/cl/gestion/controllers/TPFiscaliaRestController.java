package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPFiscalia;
import cl.gestion.models.services.ITPFiscaliaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPFiscaliaRestController {
	
	@Autowired
	private ITPFiscaliaServices tpFiscaliaServices;
	
	@GetMapping("/tipos-fiscalia")
	public List<TPFiscalia> findAll(){
		return tpFiscaliaServices.findAll();
	}

}
