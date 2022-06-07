package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDetencionDao;
import cl.gestion.models.entity.Detencion;

@Service
public class DetencionServicesImp implements IDetencionServices{
	
	@Autowired
	private IDetencionDao detencionDao;
	
	@Override
	public List<Detencion> findAll() {
		return (List<Detencion>)detencionDao.findAll();
	}

	@Override
	public Detencion findById(Integer id) {
		return detencionDao.findById(id).orElse(null);
	}

	@Override
	public Detencion save(Detencion detencion) {
		return detencionDao.save(detencion);
	}

	@Override
	public void delete(Integer id) {
		detencionDao.deleteById(id);
	}

	@Override
	public Detencion update(Detencion detencion) {
		detencionDao.deleteById(detencion.getIdDetencion());
		return detencionDao.save(detencion);
	}

}
