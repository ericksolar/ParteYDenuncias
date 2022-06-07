package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPContactoDenuncia;

public interface ITPContactoDenunciaServices {
	
	public List<TPContactoDenuncia> findAll();
	
	public TPContactoDenuncia findById(Integer id);
	
	public TPContactoDenuncia save(TPContactoDenuncia tpContactoDenuncia);
	
	public void delete(Integer id);
	
	public TPContactoDenuncia update(TPContactoDenuncia tpContactoDenuncia);
}
