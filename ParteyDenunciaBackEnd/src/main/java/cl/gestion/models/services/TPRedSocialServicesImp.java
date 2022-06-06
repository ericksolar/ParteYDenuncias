package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.gestion.models.dao.ITPRedSocialDao;
import cl.gestion.models.entity.TPRedSocial;

public class TPRedSocialServicesImp implements ITPRedSocialServices{

	@Autowired
	private ITPRedSocialDao tpRedSocialDao;
	
	@Override
	public List<TPRedSocial> findAll() {
		return (List<TPRedSocial>)tpRedSocialDao.findAll();
	}

	@Override
	public TPRedSocial findById(Integer id) {
		return tpRedSocialDao.findById(id).orElse(null);
	}

	@Override
	public TPRedSocial save(TPRedSocial tpRedSocial) {
		return tpRedSocialDao.save(tpRedSocial);
	}

	@Override
	public void delete(Integer id) {
		tpRedSocialDao.deleteById(id);
	}

	@Override
	public TPRedSocial update(TPRedSocial tpRedSocial) {
		tpRedSocialDao.deleteById(tpRedSocial.getCdtpRedSocial());
		return tpRedSocialDao.save(tpRedSocial);
	}

}
