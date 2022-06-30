package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import cl.gestion.models.entity.RolImputado;
import cl.gestion.models.services.IRolImputadoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class RolImputadoRestController {

	@Autowired
	private IRolImputadoServices rolImputadoServices;
	
	//Consultar todo
	@GetMapping("/rol-imputado")
	public List<RolImputado> mostrarTodo(){
		return rolImputadoServices.findAll();
	}

	@PostMapping("/rol-imputado")
	@ResponseStatus(HttpStatus.CREATED)
	public RolImputado Create(@RequestBody RolImputado rolImputado)
	{				
		return rolImputadoServices.save(rolImputado);
	}

}
