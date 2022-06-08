package cl.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gestion.models.entity.TPLugarProcedimiento;
import cl.gestion.models.services.ITPLugarProcedimientoServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class TPLugarProcedimientoRestController {
	
	@Autowired
	private ITPLugarProcedimientoServices tpLugarProcedimientoServices;
	
	@GetMapping("/tipos-lugar-procedimiento")
	public List<TPLugarProcedimiento> findAll(){
		return tpLugarProcedimientoServices.findAll();
	}
}
