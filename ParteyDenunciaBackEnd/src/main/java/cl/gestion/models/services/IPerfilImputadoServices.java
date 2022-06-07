package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.PerfilImputado;

public interface IPerfilImputadoServices {
	
	public List<PerfilImputado> findAll();
	
	public PerfilImputado findById(Integer id);
	
	public PerfilImputado save(PerfilImputado perfilImputado);
	
	public void delete(Integer id);
	
	public PerfilImputado update(PerfilImputado perfilImputado);
}
