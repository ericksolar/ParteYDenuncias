package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPEstadoMigratorio;

public interface ITPEstadoMigratorioServices {
	
	public List<TPEstadoMigratorio> findAll();
	
	public TPEstadoMigratorio findById(Integer id);
	
	public TPEstadoMigratorio save(TPEstadoMigratorio tpEstadoMigratorio);
	
	public void delete(Integer id);
	
	public TPEstadoMigratorio update(TPEstadoMigratorio tpEstadoMigratorio);
}
