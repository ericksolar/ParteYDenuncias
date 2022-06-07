package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.EstadoDenuncia;

public interface IEstadoDenunciaServices {
	
	public List<EstadoDenuncia> findAll();
	
	public EstadoDenuncia findById(Integer id);
	
	public EstadoDenuncia save(EstadoDenuncia estadoDenuncia);
	
	public void delete(Integer id);
	
	public EstadoDenuncia update(EstadoDenuncia estadoDenuncia);
}
