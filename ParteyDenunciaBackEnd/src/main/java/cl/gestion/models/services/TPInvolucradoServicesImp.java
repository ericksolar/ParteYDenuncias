 package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPInvolucradoDao;
import cl.gestion.models.entity.TPInvolucrado;

@Service
public class TPInvolucradoServicesImp implements ITPInvolucradoServices{
	
	@Autowired
	private ITPInvolucradoDao tpInvolucradoDao;
	
	@Override
	public List<TPInvolucrado> findAll() {
		return (List<TPInvolucrado>)tpInvolucradoDao.findAll();
	}

	@Override
	public TPInvolucrado findById(Integer id) {
		return tpInvolucradoDao.findById(id).orElse(null);
	}

	@Override
	public TPInvolucrado save(TPInvolucrado tpInvolucrado) {
		return tpInvolucradoDao.save(tpInvolucrado);
	}

	@Override
	public void delete(Integer id) {
		tpInvolucradoDao.deleteById(id);
	}

	@Override
	public TPInvolucrado update(TPInvolucrado tpInvolucrado) {
		tpInvolucradoDao.deleteById(tpInvolucrado.getCdtpInvolucrado());
		return tpInvolucradoDao.save(tpInvolucrado);
	}

}
