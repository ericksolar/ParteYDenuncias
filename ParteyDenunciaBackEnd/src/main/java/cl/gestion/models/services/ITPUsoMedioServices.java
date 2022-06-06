package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPUsoMedio;

public interface ITPUsoMedioServices {
	
	public List<TPUsoMedio> findAll();
	
	public TPUsoMedio findById(Integer id);
	
	public TPUsoMedio save(TPUsoMedio tpUsoMedio);
	
	public void delete(Integer id);
	
	public TPUsoMedio update(TPUsoMedio tpUsoMedio);
}
