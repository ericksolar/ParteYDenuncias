package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPEstadoPersonaDao;
import cl.gestion.models.entity.TPEstadoPersona;

@Service
public class TPEstadoPersonaServicesImp implements ITPEstadoPersonaServices{
	
	@Autowired
	private ITPEstadoPersonaDao tpEstadoPersonaDao;
	
	@Override
	public List<TPEstadoPersona> findAll() {
		return (List<TPEstadoPersona>)tpEstadoPersonaDao.findAll();
	}

	@Override
	public TPEstadoPersona findById(Integer id) {
		return tpEstadoPersonaDao.findById(id).orElse(null);
	}

	@Override
	public TPEstadoPersona save(TPEstadoPersona tpEstadoPersona) {
		return tpEstadoPersonaDao.save(tpEstadoPersona);
	}

	@Override
	public void delete(Integer id) {
		tpEstadoPersonaDao.deleteById(id);
	}

	@Override
	public TPEstadoPersona update(TPEstadoPersona tpEstadoPersona) {
		tpEstadoPersonaDao.deleteById(tpEstadoPersona.getCdtpEstadoPersona());
		return tpEstadoPersonaDao.save(tpEstadoPersona);
	}

}
