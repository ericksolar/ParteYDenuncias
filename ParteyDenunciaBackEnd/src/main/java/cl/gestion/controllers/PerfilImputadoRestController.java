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

import cl.gestion.models.entity.PerfilImputado;
import cl.gestion.models.services.IPerfilImputadoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class PerfilImputadoRestController {
	
	@Autowired
	private IPerfilImputadoServices perfilImputadoServices;
	
	//Consultar todo
	@GetMapping("/perfil-imputado")
	public List<PerfilImputado> mostrarTodo(){
		return perfilImputadoServices.findAll();
	}
	
	@PostMapping("/perfil-imputado")
	@ResponseStatus(HttpStatus.CREATED)
	public PerfilImputado Create(@RequestBody PerfilImputado perfilImputado)
	{				
		return perfilImputadoServices.save(perfilImputado);
	}
}
