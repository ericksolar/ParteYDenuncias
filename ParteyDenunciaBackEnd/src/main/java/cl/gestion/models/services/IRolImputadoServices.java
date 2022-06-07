package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.RolImputado;

public interface IRolImputadoServices {
	
	public List<RolImputado> findAll();
	
	public RolImputado findById(Integer id);
	
	public RolImputado save(RolImputado rolImputado);
	
	public void delete(Integer id);
	
	public RolImputado update(RolImputado rolImputado);
}
