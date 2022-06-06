package cl.gestion.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.gestion.models.entity.Delito;


public interface IDelitoDao extends CrudRepository<Delito, Integer>{

}
