package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.MedioTransporte;

public interface IMedioTransporteServices {
	
	public List<MedioTransporte> findAll();
	
	public MedioTransporte findById(Integer id);
	
	public MedioTransporte save(MedioTransporte medioTransporte);
	
	public void delete(Integer id);
	
	public MedioTransporte update(MedioTransporte medioTransporte);
}
