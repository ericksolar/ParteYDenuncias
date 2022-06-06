package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPIdiomaDao;
import cl.gestion.models.entity.TPIdioma;

@Service
public class TPIdiomaServicesImp implements ITPIdiomaServices{

	@Autowired
	private ITPIdiomaDao tpIdiomaDao;
	
	@Override
	public List<TPIdioma> findAll() {
		return (List<TPIdioma>)tpIdiomaDao.findAll();
	}

	@Override
	public TPIdioma findById(Integer id) {
		return tpIdiomaDao.findById(id).orElse(null);
	}

	@Override
	public TPIdioma save(TPIdioma tpIdioma) {
		return tpIdiomaDao.save(tpIdioma);
	}

	@Override
	public void delete(Integer id) {
		tpIdiomaDao.deleteById(id);
	}

	@Override
	public TPIdioma update(TPIdioma tpIdioma) {
		tpIdiomaDao.deleteById(tpIdioma.getCdtpIdioma());
		return tpIdiomaDao.save(tpIdioma);
	}

}
