package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPMedioTransporte;

public interface ITPMedioTransporteServices {
	
	public List<TPMedioTransporte> findAll();
	
	public TPMedioTransporte findById(Integer id);
	
	public TPMedioTransporte save(TPMedioTransporte tpMedioTransporte);
	
	public void delete(Integer id);
	
	public TPMedioTransporte update(TPMedioTransporte tpMedioTransporte);
}
