package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPIdentidadGenero;

public interface ITPIdentidadGeneroServices {
	
	public List<TPIdentidadGenero> findAll();
	
	public TPIdentidadGenero findById(Integer id);
	
	public TPIdentidadGenero save(TPIdentidadGenero tpIdentidadGenero);
	
	public void delete(Integer id);
	
	public TPIdentidadGenero update(TPIdentidadGenero tpIdentidadGenero);
}
