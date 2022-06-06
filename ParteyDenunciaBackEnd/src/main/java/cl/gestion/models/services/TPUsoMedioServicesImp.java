package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPUsoMedioDao;
import cl.gestion.models.entity.TPUsoMedio;

@Service
public class TPUsoMedioServicesImp implements ITPUsoMedioServices{
	
	@Autowired 
	private ITPUsoMedioDao tpUsoMedioDao;
	
	@Override
	public List<TPUsoMedio> findAll() {
		return (List<TPUsoMedio>)tpUsoMedioDao.findAll();
	}

	@Override
	public TPUsoMedio findById(Integer id) {
		return tpUsoMedioDao.findById(id).orElse(null);
	}

	@Override
	public TPUsoMedio save(TPUsoMedio tpUsoMedio) {
		return tpUsoMedioDao.save(tpUsoMedio);
	}

	@Override
	public void delete(Integer id) {
		tpUsoMedioDao.deleteById(id);
	}

	@Override
	public TPUsoMedio update(TPUsoMedio tpUsoMedio) {
		tpUsoMedioDao.deleteById(tpUsoMedio.getCdtpUsoMedio());
		return tpUsoMedioDao.save(tpUsoMedio);
	}

}
