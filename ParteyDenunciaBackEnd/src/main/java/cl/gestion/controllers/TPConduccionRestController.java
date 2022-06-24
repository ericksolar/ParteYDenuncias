package cl.gestion.controllers;

import java.util.List;

import cl.gestion.models.entity.TPConduccion;
import cl.gestion.models.services.ITPConduccionServices;

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

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPConduccionRestController {
	
	@Autowired
	private ITPConduccionServices tpConduccionServices;
	
	@GetMapping("/tipos-conduccion")
	public List<TPConduccion> findAll(){
		return tpConduccionServices.findAll();
	}
	
	@GetMapping("/tipos-conduccion/{id}")
	public TPConduccion Show(@PathVariable Integer id)
	{
		return tpConduccionServices.findById(id);
	}
	
	@DeleteMapping("/tipos-conduccion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Delete(@PathVariable Integer id)
	{
		tpConduccionServices.delete(id);
	}
	
	@PostMapping("/tipos-conduccion")
	@ResponseStatus(HttpStatus.CREATED)
	public TPConduccion Create(@RequestBody TPConduccion tpConduccion)
	{
		tpConduccion.setCdtpConduccion(null);
		return tpConduccionServices.save(tpConduccion);
	}
	
	@PutMapping("/tipos-conduccion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TPConduccion Update(@RequestBody TPConduccion tpConduccion, @PathVariable Integer id)
	{
		TPConduccion tpConduccionTemp = tpConduccionServices.findById(id);
		tpConduccionTemp.setGltpConduccion(tpConduccion.getGltpConduccion());	
		return tpConduccionServices.save(tpConduccionTemp);
	}
}
