package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPLugarOcurrencia;

public interface ITPLugarOcurrenciaServices {
	
	public List<TPLugarOcurrencia> findAll();
	
	public TPLugarOcurrencia findById(Integer id);
	
	public TPLugarOcurrencia save(TPLugarOcurrencia tpLugarOcurrencia);
	
	public void delete(Integer id);
	
	public TPLugarOcurrencia update(TPLugarOcurrencia tpLugarOcurrencia);
}
