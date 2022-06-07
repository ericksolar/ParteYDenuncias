package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDireccionDao;
import cl.gestion.models.entity.Direccion;

@Service
public class DireccionServicesImp implements IDireccionServices{
	
	@Autowired
	private IDireccionDao direccionDao;
	
	@Override
	public List<Direccion> findAll() {
		return (List<Direccion>)direccionDao.findAll();
	}

	@Override
	public Direccion findById(Integer id) {
		return direccionDao.findById(id).orElse(null);
	}

	@Override
	public Direccion save(Direccion direccion) {
		return direccionDao.save(direccion);
	}

	@Override
	public void delete(Integer id) {
		direccionDao.deleteById(id);
	}

	@Override
	public Direccion update(Direccion direccion) {
		direccionDao.deleteById(direccion.getCdComuna());
		return direccionDao.save(direccion);
	}

}
