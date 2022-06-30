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

import cl.gestion.models.entity.InvolucradoDenunciado;
import cl.gestion.models.services.IInvolucradoDenunciadoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class InvolucradoDenunciadoRestController {
	
	@Autowired
	private IInvolucradoDenunciadoServices involucradoDenunciadoServices;
	
	//Consultar todo
	@GetMapping("/involucrado-denunciado")
	public List<InvolucradoDenunciado> mostrarTodo(){
		return involucradoDenunciadoServices.findAll();
	}
	
	@PostMapping("/involucrado-denunciado")
	@ResponseStatus(HttpStatus.CREATED)
	public InvolucradoDenunciado Create(@RequestBody InvolucradoDenunciado involucradoDenunciado)
	{				
		return involucradoDenunciadoServices.save(involucradoDenunciado);
	}
}
