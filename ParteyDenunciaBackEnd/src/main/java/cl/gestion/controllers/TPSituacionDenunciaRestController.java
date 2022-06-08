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

import cl.gestion.models.entity.TPSituacionDenuncia;
import cl.gestion.models.services.ITPSituacionDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPSituacionDenunciaRestController {
	
	@Autowired
	private ITPSituacionDenunciaServices tpSituacionDenunciaServices;
	
	@GetMapping("/tipos-situacion-denuncia")
	public List<TPSituacionDenuncia> findAll(){
		return tpSituacionDenunciaServices.findAll();
	}
	
	@GetMapping("/tipos-situacion-denuncia/{id}")
	public TPSituacionDenuncia Show(@PathVariable Integer id)
	{
		return tpSituacionDenunciaServices.findById(id);
	}
	
	@DeleteMapping("/tipos-situacion-denuncia/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Delete(@PathVariable Integer id)
	{
		tpSituacionDenunciaServices.delete(id);
	}
	
	@PostMapping("/tipos-situacion-denuncia")
	@ResponseStatus(HttpStatus.CREATED)
	public TPSituacionDenuncia Create(@RequestBody TPSituacionDenuncia tpSituacionDenuncia)
	{
		return tpSituacionDenunciaServices.save(tpSituacionDenuncia);
	}
	
	@PutMapping("/tipos-situacion-denuncia/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TPSituacionDenuncia Update(@RequestBody TPSituacionDenuncia tpSituacionDenuncia, @PathVariable Integer id)
	{
		TPSituacionDenuncia tpSituacionDenunciaTemp = tpSituacionDenunciaServices.findById(id);
		tpSituacionDenunciaTemp.setGltpSituacion(tpSituacionDenuncia.getGltpSituacion());
		return tpSituacionDenunciaServices.save(tpSituacionDenunciaTemp);
	}

}
