package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.EstadoInvolucrado;

public interface IEstadoInvolucradoServices {
	
	public List<EstadoInvolucrado> findAll();
	
	public EstadoInvolucrado findById(Integer id);
	
	public EstadoInvolucrado save(EstadoInvolucrado estadoInvolucrado);
	
	public void delete(Integer id);
	
	public EstadoInvolucrado update(EstadoInvolucrado estadoInvolucrado);
}
