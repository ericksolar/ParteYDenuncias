package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPCausaDetencion;

public interface ITPCausaDetencionServices {
	
	public List<TPCausaDetencion> findAll();
	
	public TPCausaDetencion findById(Integer id);
	
	public TPCausaDetencion save(TPCausaDetencion tpCausaDetencion);
	
	public void delete(Integer id);
	
	public TPCausaDetencion update(TPCausaDetencion tpCausaDetencion);
}
