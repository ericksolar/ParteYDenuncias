package cl.gestion.models.services;

import java.util.Date;
import java.util.List;

import cl.gestion.models.dto.DenunciaDTO;
import cl.gestion.models.entity.Denuncia;

public interface IDenunciaServices {
	
	public List<Denuncia> findAll();
	
	public Denuncia findById(Integer id);
	
	public Denuncia save(DenunciaDTO denunciaDTO);
	
	public void delete(Integer id);
	
	public Denuncia update(Denuncia denuncia);
	
	public void PA_CrearDenunciaReparticionCorrelativo( String CDReparticion, String IDInstitucionCargo, String FCInicioDenuncia, String FCTerminoDenuncia, String NRRutUsuario);

}
