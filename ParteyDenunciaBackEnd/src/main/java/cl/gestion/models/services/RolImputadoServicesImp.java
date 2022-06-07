package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.gestion.models.dao.IRolImputadoDao;
import cl.gestion.models.entity.RolImputado;

public class RolImputadoServicesImp implements IRolImputadoServices{
	
	@Autowired
	private	IRolImputadoDao rolImputadoDao;
	
	@Override
	public List<RolImputado> findAll() {
		return (List<RolImputado>)rolImputadoDao.findAll();
	}

	@Override
	public RolImputado findById(Integer id) {
		return rolImputadoDao.findById(id).orElse(null);
	}

	@Override
	public RolImputado save(RolImputado rolImputado) {
		return rolImputadoDao.save(rolImputado);
	}

	@Override
	public void delete(Integer id) {
		rolImputadoDao.deleteById(id);
	}

	@Override
	public RolImputado update(RolImputado rolImputado) {
		rolImputadoDao.deleteById(rolImputado.getIdRolImputado());
		return rolImputadoDao.save(rolImputado);
	}

}
