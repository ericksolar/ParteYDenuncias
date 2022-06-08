package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPEstadoMigratorio;
import cl.gestion.models.services.ITPEstadoMigratorioServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPEstadoMigratorioRestController {
	
	@Autowired
	private ITPEstadoMigratorioServices tpEstadoMigratorioServices;
	
	@GetMapping("/tipos-estado-migratorio")
	public List<TPEstadoMigratorio> findAll(){
		return tpEstadoMigratorioServices.findAll();
	}
}
