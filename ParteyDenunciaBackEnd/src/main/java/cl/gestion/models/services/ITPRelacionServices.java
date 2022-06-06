package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPRelacion;

public interface ITPRelacionServices {
	
	public List<TPRelacion> findAll();
	
	public TPRelacion findById(Integer id);
	
	public TPRelacion save(TPRelacion tpRelacion);
	
	public void delete(Integer id);
	
	public TPRelacion update(TPRelacion tpRelacion);
}
