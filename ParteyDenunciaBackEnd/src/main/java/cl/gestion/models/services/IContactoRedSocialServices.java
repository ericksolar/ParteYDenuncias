package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.ContactoRedSocial;

public interface IContactoRedSocialServices {
	
	public List<ContactoRedSocial> findAll();
	
	public ContactoRedSocial findById(Integer id);
	
	public ContactoRedSocial save(ContactoRedSocial contactoRedSocial);
	
	public void delete(Integer id);
	
	public ContactoRedSocial update(ContactoRedSocial contactoRedSocial);
}
