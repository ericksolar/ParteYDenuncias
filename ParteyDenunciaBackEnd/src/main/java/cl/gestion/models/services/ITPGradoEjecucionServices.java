package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPGradoEjecucion;

public interface ITPGradoEjecucionServices {

	public List<TPGradoEjecucion> findAll();
	
	public TPGradoEjecucion findById(Integer id);
	
	public TPGradoEjecucion save(TPGradoEjecucion tpGradoEjecucion);
	
	public void delete(Integer id);
	
	public TPGradoEjecucion update(TPGradoEjecucion tpGradoEjecucion);
}
