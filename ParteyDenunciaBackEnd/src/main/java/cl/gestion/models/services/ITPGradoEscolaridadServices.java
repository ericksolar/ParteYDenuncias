package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPGradoEscolaridad;

public interface ITPGradoEscolaridadServices {
	
	public List<TPGradoEscolaridad> findAll();
	
	public TPGradoEscolaridad findById(Integer id);
	
	public TPGradoEscolaridad save(TPGradoEscolaridad tpGradoEscolaridad);
	
	public void delete(Integer id);
	
	public TPGradoEscolaridad update(TPGradoEscolaridad tpGradoEscolaridad);
}
