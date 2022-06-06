package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPRedSocial;

public interface ITPRedSocialServices {
	
	public List<TPRedSocial> findAll();
	
	public TPRedSocial findById(Integer id);
	
	public TPRedSocial save(TPRedSocial tpRedSocial);
	
	public void delete(Integer id);
	
	public TPRedSocial update(TPRedSocial tpRedSocial);
}
