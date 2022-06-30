package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.MedioTransporte;
import cl.gestion.models.services.IMedioTransporteServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class MedioTransporteRestController {
	
	@Autowired
	private IMedioTransporteServices medioTransporteServices;
	
	//Consultar todo
	@GetMapping("/medio-transporte")
	public List<MedioTransporte> mostrarTodo(){
		return medioTransporteServices.findAll();
	}
	
	@PostMapping("/medio-transporte")
	@ResponseStatus(HttpStatus.CREATED)
	public MedioTransporte Create(@RequestBody MedioTransporte medioTransporte)
	{				
		return medioTransporteServices.save(medioTransporte);
	}
}
