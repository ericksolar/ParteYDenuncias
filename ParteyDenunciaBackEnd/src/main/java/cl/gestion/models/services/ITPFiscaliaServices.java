package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPFiscalia;

public interface ITPFiscaliaServices {
	
	public List<TPFiscalia> findAll();
	
	public TPFiscalia findById(Integer id);
	
	public TPFiscalia save(TPFiscalia tpFiscalia);
	
	public void delete(Integer id);
	
	public TPFiscalia update(TPFiscalia tpFiscalia);
}
