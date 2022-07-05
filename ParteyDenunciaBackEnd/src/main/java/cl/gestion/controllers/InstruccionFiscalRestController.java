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

import cl.gestion.models.entity.InstruccionFiscal;
import cl.gestion.models.services.IInstruccionFiscalServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class InstruccionFiscalRestController {
	
	@Autowired
	private IInstruccionFiscalServices instruccionFiscalServices;
	
	//Consultar todo
	@GetMapping("/instruccion-fiscal")
	public List<InstruccionFiscal> mostrarTodo(){
		return instruccionFiscalServices.findAll();
	}
	
	@PostMapping("/instruccion-fiscal")
	@ResponseStatus(HttpStatus.CREATED)
	public InstruccionFiscal Create(@RequestBody InstruccionFiscal instruccionFiscal)
	{				
		return instruccionFiscalServices.save(instruccionFiscal);
	}
}
