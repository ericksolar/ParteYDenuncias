package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.CausaDetencion;

public interface ICausaDetencionServices {
	
	public List<CausaDetencion> findAll();
	
	public CausaDetencion findById(Integer id);
	
	public CausaDetencion save(CausaDetencion causaDetencion);
	
	public void delete(Integer id);
	
	public CausaDetencion update(CausaDetencion causaDetencion);
}
