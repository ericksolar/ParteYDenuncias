package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPCausaDetencionDao;
import cl.gestion.models.entity.TPCausaDetencion;

@Service
public class TPCausaDetencionServicesImp implements ITPCausaDetencionServices{
	
	@Autowired
	private ITPCausaDetencionDao tpCausaDetencionDao;
	
	@Override
	public List<TPCausaDetencion> findAll() {
		return (List<TPCausaDetencion>)tpCausaDetencionDao.findAll();
	}

	@Override
	public TPCausaDetencion findById(Integer id) {
		return tpCausaDetencionDao.findById(id).orElse(null);
	}

	@Override
	public TPCausaDetencion save(TPCausaDetencion tpCausaDetencion) {
		return tpCausaDetencionDao.save(tpCausaDetencion);
	}

	@Override
	public void delete(Integer id) {
		tpCausaDetencionDao.deleteById(id);
	}

	@Override
	public TPCausaDetencion update(TPCausaDetencion tpCausaDetencion) {
		tpCausaDetencionDao.deleteById(tpCausaDetencion.getCdtpCausaDetencion());
		return tpCausaDetencionDao.save(tpCausaDetencion);
	}

}
