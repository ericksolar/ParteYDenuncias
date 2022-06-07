package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.DetalleDenuncia;

public interface IDetalleDenunciaServices {
	
	public List<DetalleDenuncia> findAll();
	
	public DetalleDenuncia findById(Integer id);
	
	public DetalleDenuncia save(DetalleDenuncia detalleDenuncia);
	
	public void delete(Integer id);
	
	public DetalleDenuncia update(DetalleDenuncia detalleDenuncia);
}
