package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IPersonaParteDao;
import cl.gestion.models.entity.PersonaParte;

@Service
public class PersonaParteServicesImp implements IPersonaParteServices{
	
	@Autowired
	private IPersonaParteDao personaParteDao;
	
	@Override
	public List<PersonaParte> findAll() {
		return (List<PersonaParte>)personaParteDao.findAll();
	}

	@Override
	public PersonaParte findById(Integer id) {
		return personaParteDao.findById(id).orElse(null);
	}

	@Override
	public PersonaParte save(PersonaParte personaParte) {
		return personaParteDao.save(personaParte);
	}

	@Override
	public void delete(Integer id) {
		personaParteDao.deleteById(id);
	}

	@Override
	public PersonaParte update(PersonaParte personaParte) {
		personaParteDao.deleteById(personaParte.getIdPersona());
		return personaParteDao.save(personaParte);
	}

}
