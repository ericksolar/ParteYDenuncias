package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.DetalleDenuncia;
import cl.gestion.models.services.IDetalleDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DetalleDenunciaRestController {
	
	@Autowired
	private IDetalleDenunciaServices detalleDenunciaServices;
	
	@PostMapping("/detalle-denuncia")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleDenuncia Create(@RequestBody DetalleDenuncia detalleDenuncia)
	{				
		return detalleDenunciaServices.save(detalleDenuncia);
	}
}