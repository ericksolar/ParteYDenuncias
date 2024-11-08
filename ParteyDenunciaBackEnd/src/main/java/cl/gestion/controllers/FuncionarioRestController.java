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
import cl.gestion.models.entity.Funcionario;
import cl.gestion.models.services.IFuncionarioServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class FuncionarioRestController {
	
	@Autowired
	private IFuncionarioServices funcionarioServices;
	
	@GetMapping("/funcionario")
	public List<Funcionario> mostrarTodo(){
		return funcionarioServices.findAll();
	}
	
	@PostMapping("/funcionario")
	@ResponseStatus(HttpStatus.CREATED)
	public Funcionario Create(@RequestBody Funcionario funcionario)
	{				
		return funcionarioServices.save(funcionario);
	}
}
