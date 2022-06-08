package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.DenunciaPorMenorEdad;
import cl.gestion.models.services.IDenunciaPorMenorEdadServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DenunciaPorMenorEdadRestController {
	
	@Autowired
	private IDenunciaPorMenorEdadServices denunciaPorMenorEdadServices;
	
	@PostMapping("/denuncia-por-menor-edad")
	@ResponseStatus(HttpStatus.CREATED)
	public DenunciaPorMenorEdad Create(@RequestBody DenunciaPorMenorEdad denunciaPorMenorEdad)
	{				
		return denunciaPorMenorEdadServices.save(denunciaPorMenorEdad);
	}
}
