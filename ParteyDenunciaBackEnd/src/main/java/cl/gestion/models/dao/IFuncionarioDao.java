package cl.gestion.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.gestion.models.entity.Funcionario;

public interface IFuncionarioDao extends CrudRepository<Funcionario,Integer>{

}
