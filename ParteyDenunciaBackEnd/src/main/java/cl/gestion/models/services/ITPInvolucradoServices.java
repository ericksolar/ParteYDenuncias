package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPInvolucrado;

public interface ITPInvolucradoServices {
	
	public List<TPInvolucrado> findAll();
	
	public TPInvolucrado findById(Integer id);
	
	public TPInvolucrado save(TPInvolucrado tpInvolucrado);
	
	public void delete(Integer id);
	
	public TPInvolucrado update(TPInvolucrado tpInvolucrado);
}
