package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPZonaDelito;
import cl.gestion.models.services.ITPZonaDelitoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPZonaDelitoRestController {

	@Autowired
	private ITPZonaDelitoServices tpZonaDelitoServices;
	
	@GetMapping("/tipos-zona-delito")
	public List<TPZonaDelito> ShowAll(){
		return tpZonaDelitoServices.findAll();
	}
	
	@GetMapping("/tipos-zona-delito/{id}")
	public TPZonaDelito Show(@PathVariable Integer id)
	{
		return tpZonaDelitoServices.findById(id);
	}
	
	@DeleteMapping("/tipos-zona-delito/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Delete(@PathVariable Integer id)
	{
		tpZonaDelitoServices.delete(id);
	}
	
	@PostMapping("/tipos-zona-delito")
	@ResponseStatus(HttpStatus.CREATED)
	public TPZonaDelito Create(@RequestBody TPZonaDelito tpZonaDelito)
	{
		return tpZonaDelitoServices.save(tpZonaDelito);
	}
	
	@PutMapping("/tipos-zona-delito/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TPZonaDelito Update(@RequestBody TPZonaDelito tpZonaDelito, @PathVariable Integer id)
	{
		TPZonaDelito tpZonaDelitoTemp = tpZonaDelitoServices.findById(id);
		tpZonaDelitoTemp.setNmzonadelito(tpZonaDelito.getNmzonadelito());	
		return tpZonaDelitoServices.save(tpZonaDelitoTemp);
	}
	
}
