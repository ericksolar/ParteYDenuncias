package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPZonaDelitoDao;
import cl.gestion.models.entity.TPZonaDelito;

@Service
public class TPZonaDelitoServicesImp implements ITPZonaDelitoServices{

	@Autowired
	private ITPZonaDelitoDao tpZonaDelitoDao;
	
	@Override
	public List<TPZonaDelito> findAll() {
		return (List<TPZonaDelito>)tpZonaDelitoDao.findAll();
	}

	@Override
	public TPZonaDelito findById(Integer id) {
		return tpZonaDelitoDao.findById(id).orElse(null);
	}

	@Override
	public TPZonaDelito save(TPZonaDelito tpZonaDelito) {
		return tpZonaDelitoDao.save(tpZonaDelito);
	}

	@Override
	public void delete(Integer id) {
		tpZonaDelitoDao.deleteById(id);
	}

	@Override
	public TPZonaDelito update(TPZonaDelito tpZonaDelito) {
		tpZonaDelitoDao.deleteById(tpZonaDelito.getCdtpZonaDelito());
		return tpZonaDelitoDao.save(tpZonaDelito);
	}



}
