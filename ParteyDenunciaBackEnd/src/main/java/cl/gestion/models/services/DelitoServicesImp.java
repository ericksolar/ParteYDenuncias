package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDelitoDao;
import cl.gestion.models.entity.Delito;

@Service
public class DelitoServicesImp implements IDelitoServices{
	
	@Autowired
	private IDelitoDao delitoDao;
	
	@Override
	public List<Delito> findAll() {
		return (List<Delito>)delitoDao.findAll();
	}

	@Override
	public Delito findById(Integer id) {
		return delitoDao.findById(id).orElse(null);
	}

	@Override
	public Delito save(Delito delito) {
		return delitoDao.save(delito);
	}

	@Override
	public void delete(Integer id) {
		delitoDao.deleteById(id);
	}

	@Override
	public Delito update(Delito delito) {
		delitoDao.deleteById(delito.getIdDelito());
		return delitoDao.save(delito);
	}

}
