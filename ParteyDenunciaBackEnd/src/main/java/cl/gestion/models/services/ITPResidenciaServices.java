package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPResidencia;

public interface ITPResidenciaServices {
	
	public List<TPResidencia> findAll();
	
	public TPResidencia findById(Integer id);
	
	public TPResidencia save(TPResidencia tpResidencia);
	
	public void delete(Integer id);
	
	public TPResidencia update(TPResidencia tpResidencia);
}
