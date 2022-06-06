package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPRolImputadoDao;
import cl.gestion.models.entity.TPRolImputado;

@Service
public class TPRolImputadoServicesImp implements ITPRolImputadoServices{
	
	@Autowired
	private ITPRolImputadoDao tpRolImputadoDao;
	
	@Override
	public List<TPRolImputado> findAll() {
		return (List<TPRolImputado>)tpRolImputadoDao.findAll();
	}

	@Override
	public TPRolImputado findById(Integer id) {
		return tpRolImputadoDao.findById(id).orElse(null);
	}

	@Override
	public TPRolImputado save(TPRolImputado tpRolImputado) {
		return tpRolImputadoDao.save(tpRolImputado);
	}

	@Override
	public void delete(Integer id) {
		tpRolImputadoDao.deleteById(id);
	}

	@Override
	public TPRolImputado update(TPRolImputado tpRolImputado) {
		tpRolImputadoDao.deleteById(tpRolImputado.getCdtpRolImputado());
		return tpRolImputadoDao.save(tpRolImputado);
	}
	
}
