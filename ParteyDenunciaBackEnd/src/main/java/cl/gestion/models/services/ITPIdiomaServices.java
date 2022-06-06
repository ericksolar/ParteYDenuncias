package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPIdioma;

public interface ITPIdiomaServices {
	
	public List<TPIdioma> findAll();
	
	public TPIdioma findById(Integer id);
	
	public TPIdioma save(TPIdioma tpIdioma);
	
	public void delete(Integer id);
	
	public TPIdioma update(TPIdioma tpIdioma);
}
