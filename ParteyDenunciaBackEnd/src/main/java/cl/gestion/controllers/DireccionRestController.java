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

import cl.gestion.models.entity.Direccion;
import cl.gestion.models.services.IDireccionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DireccionRestController {
	
	@Autowired
	private IDireccionServices direccionServices;
	
	@GetMapping("/direccion")
	public List<Direccion> mostrarTodo(){
		return direccionServices.findAll();
	}
	
	@PostMapping("/direccion")
	@ResponseStatus(HttpStatus.CREATED)
	public Direccion Create(@RequestBody Direccion direccion)
	{				
		return direccionServices.save(direccion);
	}
}
