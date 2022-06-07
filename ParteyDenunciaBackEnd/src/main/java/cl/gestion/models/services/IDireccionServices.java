package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Direccion;

public interface IDireccionServices {
	
	public List<Direccion> findAll();
	
	public Direccion findById(Integer id);
	
	public Direccion save(Direccion direccion);
	
	public void delete(Integer id);
	
	public Direccion update(Direccion direccion);
}
