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

import cl.gestion.models.entity.Involucrado;
import cl.gestion.models.entity.MedioTransporteInvolucrado;
import cl.gestion.models.services.IInvolucradoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class InvolucradoRestController {

	@Autowired
	private IInvolucradoServices involucradoServices;
	
	//Consultar todo
	@GetMapping("/involucrado")
	public List<Involucrado> mostrarTodo(){
		return involucradoServices.findAll();
	}
	
	@PostMapping("/involucrado")
	@ResponseStatus(HttpStatus.CREATED)
	public Involucrado Create(@RequestBody Involucrado involucrado)
	{				
		return involucradoServices.save(involucrado);
	}
	
	/*@PostMapping("/crearPersona")
	@ResponseStatus(HttpStatus.CREATED)
	public void CrearPersona()
	{				
		involucradoServices.UsarPaCrearPersona();
		System.out.println("involucradoServices.UsarPaCrearPersona()");
	}*/
	
	
}
