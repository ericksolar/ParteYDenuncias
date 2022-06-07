package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IPerfilImputadoDao;
import cl.gestion.models.entity.PerfilImputado;

@Service
public class PerfilImputadoServicesImp implements IPerfilImputadoServices{

	@Autowired
	private IPerfilImputadoDao perfilImputadoDao;
	
	@Override
	public List<PerfilImputado> findAll() {
		return (List<PerfilImputado>)perfilImputadoDao.findAll();
	}

	@Override
	public PerfilImputado findById(Integer id) {
		return perfilImputadoDao.findById(id).orElse(null);
	}

	@Override
	public PerfilImputado save(PerfilImputado perfilImputado) {
		return perfilImputadoDao.save(perfilImputado);
	}

	@Override
	public void delete(Integer id) {
		perfilImputadoDao.deleteById(id);
	}

	@Override
	public PerfilImputado update(PerfilImputado perfilImputado) {
		perfilImputadoDao.deleteById(perfilImputado.getIdPerfilImputado());
		return perfilImputadoDao.save(perfilImputado);
	}
	
}
