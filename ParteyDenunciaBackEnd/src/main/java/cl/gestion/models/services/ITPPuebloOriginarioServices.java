package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPPuebloOriginario;

public interface ITPPuebloOriginarioServices {
	
	public List<TPPuebloOriginario> findAll();
	
	public TPPuebloOriginario findById(Integer id);
	
	public TPPuebloOriginario save(TPPuebloOriginario tpPuebloOriginario);
	
	public void delete(Integer id);
	
	public TPPuebloOriginario update(TPPuebloOriginario tpPuebloOriginario);
}
