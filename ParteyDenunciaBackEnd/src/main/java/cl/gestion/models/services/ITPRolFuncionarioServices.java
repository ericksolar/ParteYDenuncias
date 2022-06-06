package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPRolFuncionario;

public interface ITPRolFuncionarioServices {
	
	public List<TPRolFuncionario> findAll();
	
	public TPRolFuncionario findById(Integer id);
	
	public TPRolFuncionario save(TPRolFuncionario tpRolFuncionario);
	
	public void delete(Integer id);
	
	public TPRolFuncionario update(TPRolFuncionario tpRolFuncionario);
}
