package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Involucrado;

public interface IInvolucradoServices {
	
	public List<Involucrado> findAll();
	
	public Involucrado findById(Integer id);
	
	public Involucrado save(Involucrado involucrado);
	
	public void delete(Integer id);
	
	public Involucrado update(Involucrado involucrado);
	
	//public void UsarPaCrearPersona();
}
