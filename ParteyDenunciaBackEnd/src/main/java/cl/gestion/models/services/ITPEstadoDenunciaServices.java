package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPEstadoDenuncia;

public interface ITPEstadoDenunciaServices {
	
	public List<TPEstadoDenuncia> findAll();
	
	public TPEstadoDenuncia findById(Integer id);
	
	public TPEstadoDenuncia save(TPEstadoDenuncia tpEstadoDenuncia);
	
	public void delete(Integer id);
	
	public TPEstadoDenuncia update(TPEstadoDenuncia tpEstadoDenuncia);
}
