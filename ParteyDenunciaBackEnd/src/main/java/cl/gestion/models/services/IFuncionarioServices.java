package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Funcionario;

public interface IFuncionarioServices {
	
	public List<Funcionario> findAll();
	
	public Funcionario findById(Integer id);
	
	public Funcionario save(Funcionario funcionario);
	
	public void delete(Integer id);
	
	public Funcionario update(Funcionario funcionario);
}
