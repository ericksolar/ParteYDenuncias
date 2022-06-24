package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IInvolucradoDao;
import cl.gestion.models.entity.Involucrado;

@Service
public class InvolucradoServicesImp implements IInvolucradoServices{

	@Autowired
	private IInvolucradoDao involucradoDao;
	
	@Override
	public List<Involucrado> findAll() {
		return (List<Involucrado>)involucradoDao.findAll();
	}

	@Override
	public Involucrado findById(Integer id) {
		return involucradoDao.findById(id).orElse(null);
	}

	@Override
	public Involucrado save(Involucrado involucrado) {
		return involucradoDao.save(involucrado);
	}

	@Override
	public void delete(Integer id) {
		involucradoDao.deleteById(id);
	}

	@Override
	public Involucrado update(Involucrado involucrado) {
		involucradoDao.deleteById(involucrado.getIdInvolucrado());
		return involucradoDao.save(involucrado);
	}

	/*@Override
	public void UsarPaCrearPersona() {
		IInvolucradoDao.postCrearPersona(1, 180323120, 1, "157548512", "Oscar");
		System.out.println("Oscar");

	}*/

}
