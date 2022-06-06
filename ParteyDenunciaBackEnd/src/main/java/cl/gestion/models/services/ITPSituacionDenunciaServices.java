package cl.gestion.models.services;
import java.util.List;

import cl.gestion.models.entity.TPSituacionDenuncia;

public interface ITPSituacionDenunciaServices {
	
	public List<TPSituacionDenuncia> findAll();
	
	public TPSituacionDenuncia findById(Integer id);
	
	public TPSituacionDenuncia save(TPSituacionDenuncia tpSituacionDenuncia);
	
	public void delete(Integer id);
	
	public TPSituacionDenuncia update(TPSituacionDenuncia tpSituacionDenuncia);
	
}
