package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.Fiscalia;
import cl.gestion.models.services.IFiscaliaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class FiscaliaRestController {
	
	@Autowired
	private IFiscaliaServices fiscaliaServices;
	
	@PostMapping("/fiscalia")
	@ResponseStatus(HttpStatus.CREATED)
	public Fiscalia Create(@RequestBody Fiscalia fiscalia)
	{				
		return fiscaliaServices.save(fiscalia);
	}
}
