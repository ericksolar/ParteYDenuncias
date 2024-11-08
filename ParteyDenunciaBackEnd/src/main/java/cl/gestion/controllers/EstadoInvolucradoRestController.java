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

import cl.gestion.models.entity.EstadoInvolucrado;
import cl.gestion.models.entity.EventoMedioTransporte;
import cl.gestion.models.services.IEstadoInvolucradoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class EstadoInvolucradoRestController {
	
	@Autowired
	private IEstadoInvolucradoServices estadoInvolucradoServices;
	
	@GetMapping("/estado-involucrado")
	public List<EstadoInvolucrado> mostrarTodo(){
		return estadoInvolucradoServices.findAll();
	}
	
	@PostMapping("/estado-involucrado")
	@ResponseStatus(HttpStatus.CREATED)
	public EstadoInvolucrado Create(@RequestBody EstadoInvolucrado estadoInvolucrado)
	{				
		return estadoInvolucradoServices.save(estadoInvolucrado);
	}
}
