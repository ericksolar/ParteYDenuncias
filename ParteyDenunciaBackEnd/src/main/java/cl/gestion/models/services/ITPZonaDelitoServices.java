package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPZonaDelito;

public interface ITPZonaDelitoServices {

	public List<TPZonaDelito> findAll();
	
	public TPZonaDelito findById(Integer id);
	
	public TPZonaDelito save(TPZonaDelito tpZonaDelito);
	
	public void delete(Integer id);
	
	public TPZonaDelito update(TPZonaDelito tpZonaDelito);

}
