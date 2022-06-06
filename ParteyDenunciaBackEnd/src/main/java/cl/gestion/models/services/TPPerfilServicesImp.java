package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPPerfilDao;
import cl.gestion.models.entity.TPPerfil;

@Service
public class TPPerfilServicesImp implements ITPPerfilServices{
	
	@Autowired
	private ITPPerfilDao tpPerfilDao;
	
	@Override
	public List<TPPerfil> findAll() {
		return (List<TPPerfil>)tpPerfilDao.findAll();
	}

	@Override
	public TPPerfil findById(Integer id) {
		return tpPerfilDao.findById(id).orElse(null);
	}

	@Override
	public TPPerfil save(TPPerfil tpPerfil) {
		return tpPerfilDao.save(tpPerfil);
	}

	@Override
	public void delete(Integer id) {
		tpPerfilDao.deleteById(id);
	}

	@Override
	public TPPerfil update(TPPerfil tpPerfil) {
		tpPerfilDao.deleteById(tpPerfil.getCdtpPerfil());
		return tpPerfilDao.save(tpPerfil);
	}

}
