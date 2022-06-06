package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPMedioNotificacion;

public interface ITPMedioNotificacionServices {
	
	public List<TPMedioNotificacion> findAll();
	
	public TPMedioNotificacion findById(Integer id);
	
	public TPMedioNotificacion save(TPMedioNotificacion tpMedioNotificacion);
	
	public void delete(Integer id);
	
	public TPMedioNotificacion update(TPMedioNotificacion tpMedioNotificacion);
}
