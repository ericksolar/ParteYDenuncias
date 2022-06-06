package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPConduccionDao;
import cl.gestion.models.entity.TPConduccion;

@Service
public class TPConduccionServicesImp implements ITPConduccionServices {
	
	@Autowired
	private ITPConduccionDao tpConduccionDao;

	@Override
	public List<TPConduccion> findAll() {
		return (List<TPConduccion>) tpConduccionDao.findAll();
	}
	
	@Override
	public TPConduccion findById(Integer id) {
		return tpConduccionDao.findById(id).orElse(null);
	}
	
	@Override
	public TPConduccion save(TPConduccion tpConduccion) {
		return tpConduccionDao.save(tpConduccion);
	}
	
	@Override
	public void delete(Integer id) {
		tpConduccionDao.deleteById(id);
	}
	
	@Override
	public TPConduccion update(TPConduccion tpConduccion) {
		tpConduccionDao.deleteById(tpConduccion.getCdtpConduccion());
		return tpConduccionDao.save(tpConduccion);
	}



}
