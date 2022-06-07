package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPNNA;

public interface ITPNNAServices {
	
	public List<TPNNA> findAll();
	
	public TPNNA findById(Integer id);
	
	public TPNNA save(TPNNA tpNNA);
	
	public void delete(Integer id);
	
	public TPNNA update(TPNNA tpNNA);
}
