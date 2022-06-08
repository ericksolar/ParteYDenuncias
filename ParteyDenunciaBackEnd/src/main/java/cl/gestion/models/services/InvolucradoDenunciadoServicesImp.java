package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IInvolucradoDenunciadoDao;
import cl.gestion.models.entity.InvolucradoDenunciado;

@Service
public class InvolucradoDenunciadoServicesImp implements IInvolucradoDenunciadoServices{
	
	@Autowired
	private IInvolucradoDenunciadoDao involucradoDenunciadoDao;
	
	@Override
	public List<InvolucradoDenunciado> findAll() {
		return (List<InvolucradoDenunciado>)involucradoDenunciadoDao.findAll();
	}

	@Override
	public InvolucradoDenunciado findById(Integer id) {
		return involucradoDenunciadoDao.findById(id).orElse(null);
	}

	@Override
	public InvolucradoDenunciado save(InvolucradoDenunciado involucradoDenunciado) {
		return involucradoDenunciadoDao.save(involucradoDenunciado);
	}

	@Override
	public void delete(Integer id) {
		involucradoDenunciadoDao.deleteById(id);
	}

	@Override
	public InvolucradoDenunciado update(InvolucradoDenunciado involucradoDenunciado) {
		involucradoDenunciadoDao.deleteById(involucradoDenunciado.getIdInvolucradoDenunciado());
		return involucradoDenunciadoDao.save(involucradoDenunciado);
	}

}
