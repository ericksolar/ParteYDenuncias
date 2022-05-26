package cl.gestion.parteydenuncia.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.parteydenuncia.models.dao.ITPConduccionDao;
import cl.gestion.parteydenuncia.models.entity.TPConduccion;

@Service
public class TPConduccionServicesImpl implements ITPConduccionServices {
	
	@Autowired
	private ITPConduccionDao tpConduccionDao;

	@Override
	public List<TPConduccion> findAll() {
		return (List<TPConduccion>) tpConduccionDao.findAll();
	}



}
