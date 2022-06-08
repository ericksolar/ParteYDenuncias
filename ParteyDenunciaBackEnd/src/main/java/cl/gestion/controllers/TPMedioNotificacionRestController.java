package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPMedioNotificacion;
import cl.gestion.models.services.ITPMedioNotificacionServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPMedioNotificacionRestController {
	
	@Autowired
	private ITPMedioNotificacionServices tpMedioNotificacionServices;
	
	@GetMapping("/tipos-medio-notificacion")
	public List<TPMedioNotificacion> findAll(){
		return tpMedioNotificacionServices.findAll();
	}
	
}
