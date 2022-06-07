package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Delito;

public interface IDelitoServices {
	
	public List<Delito> findAll();
	
	public Delito findById(Integer id);
	
	public Delito save(Delito delito);
	
	public void delete(Integer id);
	
	public Delito update(Delito delito);

}
