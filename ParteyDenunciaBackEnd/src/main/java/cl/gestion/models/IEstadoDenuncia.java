package cl.gestion.models;

import org.springframework.data.repository.CrudRepository;

import cl.gestion.models.entity.EstadoDenuncia;

public interface IEstadoDenuncia extends CrudRepository<EstadoDenuncia,Integer>{

}
