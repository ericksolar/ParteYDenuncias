package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPConduccion;

public interface ITPConduccionServices {

	public List<TPConduccion> findAll();
	
	public TPConduccion findById(Integer id);
	
	public TPConduccion save(TPConduccion tpConduccion);
	
	public void delete(Integer id);
	
	public TPConduccion update(TPConduccion tpConduccion);

	
}
