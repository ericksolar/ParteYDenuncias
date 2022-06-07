package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPEstadoPersona;

public interface ITPEstadoPersonaServices {
	
	public List<TPEstadoPersona> findAll();
	
	public TPEstadoPersona findById(Integer id);
	
	public TPEstadoPersona save(TPEstadoPersona tpEstadoPersona);
	
	public void delete(Integer id);
	
	public TPEstadoPersona update(TPEstadoPersona tpEstadoPersona);
}
