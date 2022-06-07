package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.MedioTransporteInvolucrado;

public interface IMedioTransporteInvolucradoServices {
	
	public List<MedioTransporteInvolucrado> findAll();
	
	public MedioTransporteInvolucrado findById(Integer id);
	
	public MedioTransporteInvolucrado save(MedioTransporteInvolucrado medioTransporteInvolucrado);
	
	public void delete(Integer id);
	
	public MedioTransporteInvolucrado update(MedioTransporteInvolucrado medioTransporteInvolucrado);
}
