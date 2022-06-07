package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.PersonaParte;

public interface IPersonaParteServices {
	
	public List<PersonaParte> findAll();
	
	public PersonaParte findById(Integer id);
	
	public PersonaParte save(PersonaParte personaParte);
	
	public void delete(Integer id);
	
	public PersonaParte update(PersonaParte personaParte);
}
