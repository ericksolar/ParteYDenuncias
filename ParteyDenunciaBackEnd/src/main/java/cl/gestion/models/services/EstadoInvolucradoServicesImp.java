package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IEstadoInvolucradoDao;
import cl.gestion.models.entity.EstadoInvolucrado;

@Service
public class EstadoInvolucradoServicesImp implements IEstadoInvolucradoServices{

	@Autowired
	private IEstadoInvolucradoDao estadoInvolucradoDao;
	
	@Override
	public List<EstadoInvolucrado> findAll() {
		return (List<EstadoInvolucrado>)estadoInvolucradoDao.findAll();
	}

	@Override
	public EstadoInvolucrado findById(Integer id) {
		return estadoInvolucradoDao.findById(id).orElse(null);
	}

	@Override
	public EstadoInvolucrado save(EstadoInvolucrado estadoInvolucrado) {
		return estadoInvolucradoDao.save(estadoInvolucrado);
	}

	@Override
	public void delete(Integer id) {
		estadoInvolucradoDao.deleteById(id);
	}

	@Override
	public EstadoInvolucrado update(EstadoInvolucrado estadoInvolucrado) {
		estadoInvolucradoDao.deleteById(estadoInvolucrado.getIdEstadoInvolucrado());
		return estadoInvolucradoDao.save(estadoInvolucrado);
	}

}
