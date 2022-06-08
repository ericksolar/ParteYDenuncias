package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPRolFuncionario;
import cl.gestion.models.services.ITPRolFuncionarioServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPRolFuncionarioRestController {
	
	@Autowired
	private ITPRolFuncionarioServices tpRolFuncionarioServices;
	
	@GetMapping("/tipos-rol-funcionario")
	public List<TPRolFuncionario> findAll(){
		return tpRolFuncionarioServices.findAll();
	}
}
