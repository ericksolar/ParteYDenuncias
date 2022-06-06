package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPPerfil;

public interface ITPPerfilServices {
	
	public List<TPPerfil> findAll();
	
	public TPPerfil findById(Integer id);
	
	public TPPerfil save(TPPerfil tpPerfil);
	
	public void delete(Integer id);
	
	public TPPerfil update(TPPerfil tpPerfil);
}
