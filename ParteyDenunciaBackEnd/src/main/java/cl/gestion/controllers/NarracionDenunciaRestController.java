package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.NarracionDenuncia;
import cl.gestion.models.services.INarracionDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class NarracionDenunciaRestController {
	
	@Autowired
	private INarracionDenunciaServices narracionDenunciaServices;
	
	@PostMapping("/narracion-denuncia")
	@ResponseStatus(HttpStatus.CREATED)
	public NarracionDenuncia Create(@RequestBody NarracionDenuncia narracionDenuncia)
	{				
		return narracionDenunciaServices.save(narracionDenuncia);
	}
	
}
