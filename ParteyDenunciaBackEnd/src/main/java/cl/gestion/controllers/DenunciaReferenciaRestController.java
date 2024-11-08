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

import cl.gestion.models.entity.DenunciaReferencia;
import cl.gestion.models.services.IDenunciaReferenciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DenunciaReferenciaRestController {
	
	@Autowired
	private IDenunciaReferenciaServices denunciaReferenciaServices;
	
	@GetMapping("/denuncia-referencia")
	public List<DenunciaReferencia> findAll(){
		return denunciaReferenciaServices.findAll();
	}
	
	@PostMapping("/denuncia-referencia")
	@ResponseStatus(HttpStatus.CREATED)
	public DenunciaReferencia Create(@RequestBody DenunciaReferencia denunciaReferencia)
	{				
		return denunciaReferenciaServices.save(denunciaReferencia);
	}
	
}
