package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IContactoRedSocialDao;
import cl.gestion.models.entity.ContactoRedSocial;

@Service
public class ContactoRedSocialServicesImp implements IContactoRedSocialServices{
	
	@Autowired
	private IContactoRedSocialDao contactoRedSocialDao;
	
	@Override
	public List<ContactoRedSocial> findAll() {
		return (List<ContactoRedSocial>)contactoRedSocialDao.findAll();
	}

	@Override
	public ContactoRedSocial findById(Integer id) {
		return contactoRedSocialDao.findById(id).orElse(null);
	}

	@Override
	public ContactoRedSocial save(ContactoRedSocial contactoRedSocial) {
		return contactoRedSocialDao.save(contactoRedSocial);
	}

	@Override
	public void delete(Integer id) {
		contactoRedSocialDao.deleteById(id);
	}

	@Override
	public ContactoRedSocial update(ContactoRedSocial contactoRedSocial) {
		contactoRedSocialDao.deleteById(contactoRedSocial.getIdRedSocial());
		return contactoRedSocialDao.save(contactoRedSocial);
	}

}
