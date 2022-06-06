package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPMedioNotificacionDao;
import cl.gestion.models.entity.TPMedioNotificacion;

@Service
public class TPMedioNotificacionServicesImp implements ITPMedioNotificacionServices{
	
	@Autowired
	private ITPMedioNotificacionDao tpMedioNotificacionDao;
	
	@Override
	public List<TPMedioNotificacion> findAll() {
		return (List<TPMedioNotificacion>)tpMedioNotificacionDao.findAll();
	}

	@Override
	public TPMedioNotificacion findById(Integer id) {
		return null;
	}

	@Override
	public TPMedioNotificacion save(TPMedioNotificacion tpMedioNotificacion) {
		return tpMedioNotificacionDao.save(tpMedioNotificacion);
	}

	@Override
	public void delete(Integer id) {
		tpMedioNotificacionDao.deleteById(id);
	}

	@Override
	public TPMedioNotificacion update(TPMedioNotificacion tpMedioNotificacion) {
		tpMedioNotificacionDao.deleteById(tpMedioNotificacion.getCdtpMedioNotificacion());
		return tpMedioNotificacionDao.save(tpMedioNotificacion);
	}

}
