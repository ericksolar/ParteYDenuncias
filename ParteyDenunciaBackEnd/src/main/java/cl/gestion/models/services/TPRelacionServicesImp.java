package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.gestion.models.dao.ITPRelacionDao;
import cl.gestion.models.entity.TPRelacion;

public class TPRelacionServicesImp implements ITPRelacionServices{

	@Autowired
	private ITPRelacionDao tpRelacionDao;
	
	@Override
	public List<TPRelacion> findAll() {
		return (List<TPRelacion>)tpRelacionDao.findAll();
	}

	@Override
	public TPRelacion findById(Integer id) {
		return tpRelacionDao.findById(id).orElse(null);
	}

	@Override
	public TPRelacion save(TPRelacion tpRelacion) {
		return tpRelacionDao.save(tpRelacion);
	}

	@Override
	public void delete(Integer id) {
		tpRelacionDao.deleteById(id);		
	}

	@Override
	public TPRelacion update(TPRelacion tpRelacion) {
		tpRelacionDao.deleteById(tpRelacion.getCdtpRelacion());
		return tpRelacionDao.save(tpRelacion);
	}

}
