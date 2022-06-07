package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPGradoEjecucionDao;
import cl.gestion.models.entity.TPGradoEjecucion;

@Service
public class TPGradoEjecucionServicesImp implements ITPGradoEjecucionServices{
	
	@Autowired
	private ITPGradoEjecucionDao tpGradoEjecucionDao;
	
	@Override
	public List<TPGradoEjecucion> findAll() {
		return (List<TPGradoEjecucion>)tpGradoEjecucionDao.findAll();
	}

	@Override
	public TPGradoEjecucion findById(Integer id) {
		return tpGradoEjecucionDao.findById(id).orElse(null);
	}

	@Override
	public TPGradoEjecucion save(TPGradoEjecucion tpGradoEjecucion) {
		return tpGradoEjecucionDao.save(tpGradoEjecucion);
	}

	@Override
	public void delete(Integer id) {
		tpGradoEjecucionDao.deleteById(id);
	}

	@Override
	public TPGradoEjecucion update(TPGradoEjecucion tpGradoEjecucion) {
		tpGradoEjecucionDao.deleteById(tpGradoEjecucion.getCdtpGradoEjecucion());
		return tpGradoEjecucionDao.save(tpGradoEjecucion);
	}

}
