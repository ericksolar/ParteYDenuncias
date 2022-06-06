package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPSituacionConvivencia;

public interface ITPSituacionConvivenciaServices {
		
	public List<TPSituacionConvivencia> findAll();
	
	public TPSituacionConvivencia findById(Integer id);
	
	public TPSituacionConvivencia save(TPSituacionConvivencia tpEstadoMigratorio);
	
	public void delete(Integer id);
	
	public TPSituacionConvivencia update(TPSituacionConvivencia tpEstadoMigratorio);
}
