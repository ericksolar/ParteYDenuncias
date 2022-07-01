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

import cl.gestion.models.entity.EstadoDenuncia;
import cl.gestion.models.services.IEstadoDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class EstadoDenunciaRestController {
	
	@Autowired
	private IEstadoDenunciaServices estadoDenunciaServices;
	
	@GetMapping("/estado-denuncia")
	public List<EstadoDenuncia> mostrarTodo(){
		return estadoDenunciaServices.findAll();
	}
	
	
	@PostMapping("/estado-denuncia")
	@ResponseStatus(HttpStatus.CREATED)
	public EstadoDenuncia Create(@RequestBody EstadoDenuncia estadoDenuncia)
	{				
		return estadoDenunciaServices.save(estadoDenuncia);
	}
}
