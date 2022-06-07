package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ICausaDetencionDao;
import cl.gestion.models.entity.CausaDetencion;

@Service
public class CausaDetencionServicesImp implements ICausaDetencionServices{
	
	@Autowired
	private ICausaDetencionDao causaDetencionDao;
	
	@Override
	public List<CausaDetencion> findAll() {
		return (List<CausaDetencion>)causaDetencionDao.findAll();
	}

	@Override
	public CausaDetencion findById(Integer id) {
		return causaDetencionDao.findById(id).orElse(null);
	}

	@Override
	public CausaDetencion save(CausaDetencion causaDetencion) {
		return causaDetencionDao.save(causaDetencion);
	}

	@Override
	public void delete(Integer id) {
		causaDetencionDao.deleteById(id);
	}

	@Override
	public CausaDetencion update(CausaDetencion causaDetencion) {
		causaDetencionDao.deleteById(causaDetencion.getIdCausaDetencion());
		return causaDetencionDao.save(causaDetencion);
	}

}
