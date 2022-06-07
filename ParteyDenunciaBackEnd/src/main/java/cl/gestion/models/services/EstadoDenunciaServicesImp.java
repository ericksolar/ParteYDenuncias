package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IEstadoDenunciaDao;
import cl.gestion.models.entity.EstadoDenuncia;

@Service
public class EstadoDenunciaServicesImp implements IEstadoDenunciaServices{
	
	@Autowired
	private IEstadoDenunciaDao estadoDenunciaDao;
	
	@Override
	public List<EstadoDenuncia> findAll() {
		return (List<EstadoDenuncia>)estadoDenunciaDao.findAll();
	}

	@Override
	public EstadoDenuncia findById(Integer id) {
		return estadoDenunciaDao.findById(id).orElse(null);
	}

	@Override
	public EstadoDenuncia save(EstadoDenuncia estadoDenuncia) {
		return estadoDenunciaDao.save(estadoDenuncia);
	}

	@Override
	public void delete(Integer id) {
		estadoDenunciaDao.deleteById(id);
	}

	@Override
	public EstadoDenuncia update(EstadoDenuncia estadoDenuncia) {
		estadoDenunciaDao.deleteById(estadoDenuncia.getIdEstadoDenuncia());
		return estadoDenunciaDao.save(estadoDenuncia);
	}

}
