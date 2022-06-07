package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Detencion;

public interface IDetencionServices {
	
	public List<Detencion> findAll();
	
	public Detencion findById(Integer id);
	
	public Detencion save(Detencion detencion);
	
	public void delete(Integer id);
	
	public Detencion update(Detencion detencion);
}
