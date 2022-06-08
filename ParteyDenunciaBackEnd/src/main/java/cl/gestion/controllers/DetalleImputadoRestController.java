package cl.gestion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.DetalleImputado;
import cl.gestion.models.services.IDetalleImputadoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DetalleImputadoRestController {
	
	@Autowired
	private IDetalleImputadoServices detalleImputadoServices;
	
	@PostMapping("/detalle-imputado")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleImputado Create(@RequestBody DetalleImputado detalleImputado)
	{				
		return detalleImputadoServices.save(detalleImputado);
	}
}
