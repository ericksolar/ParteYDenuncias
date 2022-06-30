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

import cl.gestion.models.dto.DenunciaDTO;
import cl.gestion.models.entity.Denuncia;
import cl.gestion.models.services.IDenunciaServices;

@CrossOrigin(origins = "*", allowedHeaders="*", maxAge=3600) 
@RestController
@RequestMapping("/api")
public class DenunciaRestController {
	
	@Autowired
	private IDenunciaServices denunciaServices;
	
	@GetMapping("/denuncia")
	public List<Denuncia> findAll(){
		return denunciaServices.findAll();
	}
	
	@PostMapping("/denuncia")
	@ResponseStatus(HttpStatus.CREATED)
	public Denuncia Create(@RequestBody Denuncia denuncia)
	{				
		return denunciaServices.save(denuncia);
	}
		
	@PostMapping("/denunciaPA")
	@ResponseStatus(HttpStatus.CREATED)
	public void PA_CrearDenunciaReparticionCorrelativo(@RequestBody DenunciaDTO denunciadto)
	{			
		//denunciaServices.PA_CrearDenunciaReparticionCorrelativo("22", "99", "2022-06-24T18:49:46.135", "2022-06-24T18:49:46.135", "180323120");
		//System.out.println(denunciadto.getCdReparticion());
		denunciaServices.PA_CrearDenunciaReparticionCorrelativo( denunciadto.getCdReparticion(), denunciadto.getIdInstitucionCargo() , denunciadto.getFcInicioDenuncia(), denunciadto.getFcTerminoDenuncia(), denunciadto.getNrRutUsuario());

	}
	
}
