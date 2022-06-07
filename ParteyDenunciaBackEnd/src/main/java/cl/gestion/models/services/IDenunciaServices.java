package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Denuncia;

public interface IDenunciaServices {
	
	public List<Denuncia> findAll();
	
	public Denuncia findById(Integer id);
	
	public Denuncia save(Denuncia denuncia);
	
	public void delete(Integer id);
	
	public Denuncia update(Denuncia denuncia);
}
