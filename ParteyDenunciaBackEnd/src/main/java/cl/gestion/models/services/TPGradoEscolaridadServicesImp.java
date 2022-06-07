package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPGradoEscolaridadDao;
import cl.gestion.models.entity.TPGradoEscolaridad;

@Service
public class TPGradoEscolaridadServicesImp implements ITPGradoEscolaridadServices{
	
	@Autowired
	private ITPGradoEscolaridadDao tpGradoEscolaridadDao;
	
	@Override
	public List<TPGradoEscolaridad> findAll() {
		return (List<TPGradoEscolaridad>)tpGradoEscolaridadDao.findAll();
	}

	@Override
	public TPGradoEscolaridad findById(Integer id) {
		return tpGradoEscolaridadDao.findById(id).orElse(null);
	}

	@Override
	public TPGradoEscolaridad save(TPGradoEscolaridad tpGradoEscolaridad) {
		return tpGradoEscolaridadDao.save(tpGradoEscolaridad);
	}

	@Override
	public void delete(Integer id) {
		tpGradoEscolaridadDao.deleteById(id);
	}

	@Override
	public TPGradoEscolaridad update(TPGradoEscolaridad tpGradoEscolaridad) {
		tpGradoEscolaridadDao.deleteById(tpGradoEscolaridad.getCdtpGradoEscolaridad());
		return tpGradoEscolaridadDao.save(tpGradoEscolaridad);
	}

}
