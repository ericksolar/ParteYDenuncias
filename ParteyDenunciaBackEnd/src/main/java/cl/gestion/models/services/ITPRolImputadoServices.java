package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPRolImputado;

public interface ITPRolImputadoServices {
	
	public List<TPRolImputado> findAll();
	
	public TPRolImputado findById(Integer id);
	
	public TPRolImputado save(TPRolImputado tpRolImputado);
	
	public void delete(Integer id);
	
	public TPRolImputado update(TPRolImputado tpRolImputado);
}
