package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPNNA;
import cl.gestion.models.services.ITPNNAServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPNNARestController {

	@Autowired
	private ITPNNAServices tpNNAServices;
	
	@GetMapping("/tipos-nna")
	public List<TPNNA> findAll(){
		return tpNNAServices.findAll();
	}
	
}
