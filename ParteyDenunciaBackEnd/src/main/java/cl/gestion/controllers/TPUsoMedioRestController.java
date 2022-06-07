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

import cl.gestion.models.entity.TPUsoMedio;
import cl.gestion.models.services.ITPUsoMedioServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPUsoMedioRestController {

	@Autowired
	private ITPUsoMedioServices tpUsoMedioServices;

	@GetMapping("/tipos-uso-medio")
	public List<TPUsoMedio> ShowAll(){
		return tpUsoMedioServices.findAll();
	}
	
	@GetMapping("/tipos-uso-medio/{id}")
	public TPUsoMedio Show(@PathVariable Integer id)
	{
		return tpUsoMedioServices.findById(id);
	}
	
	@DeleteMapping("/tipos-uso-medio/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Delete(@PathVariable Integer id)
	{
		tpUsoMedioServices.delete(id);
	}
	
	@PostMapping("/tipos-uso-medio")
	@ResponseStatus(HttpStatus.CREATED)
	public TPUsoMedio Create(@RequestBody TPUsoMedio tpUsoMedio)
	{
		return tpUsoMedioServices.save(tpUsoMedio);
	}
	
	@PutMapping("/tipos-uso-medio/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TPUsoMedio Update(@RequestBody TPUsoMedio tpUsoMedio, @PathVariable Integer id)
	{
		TPUsoMedio tpUsoMedioTemp = tpUsoMedioServices.findById(id);
		tpUsoMedioTemp.setCdtpUsoMedio(tpUsoMedio.getCdtpUsoMedio());
		tpUsoMedioTemp.setCdtpUsoMedio(tpUsoMedio.getCdtpUsoMedio());		
		return tpUsoMedioServices.save(tpUsoMedioTemp);
	}


	
}
