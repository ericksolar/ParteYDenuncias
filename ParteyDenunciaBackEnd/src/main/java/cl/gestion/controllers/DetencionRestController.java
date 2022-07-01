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

import cl.gestion.models.entity.Detencion;
import cl.gestion.models.services.IDetencionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DetencionRestController {
	
	@Autowired
	private IDetencionServices detencionServices;
	
	@GetMapping("/detencion")
	public List<Detencion> mostrarTodo(){
		return detencionServices.findAll();
	}
	
	
	@PostMapping("/detencion")
	@ResponseStatus(HttpStatus.CREATED)
	public Detencion Create(@RequestBody Detencion detencion)
	{				
		return detencionServices.save(detencion);
	}
}
