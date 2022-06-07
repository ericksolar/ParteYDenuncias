package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPEstadoDenunciaDao;
import cl.gestion.models.entity.TPEstadoDenuncia;

@Service
public class TPEstadoDenunciaServicesImp implements ITPEstadoDenunciaServices{
	
	@Autowired
	private ITPEstadoDenunciaDao tpEstadoDenunciaDao;
	
	@Override
	public List<TPEstadoDenuncia> findAll() {
		return (List<TPEstadoDenuncia>)tpEstadoDenunciaDao.findAll();
	}

	@Override
	public TPEstadoDenuncia findById(Integer id) {
		return tpEstadoDenunciaDao.findById(id).orElse(null);
	}

	@Override
	public TPEstadoDenuncia save(TPEstadoDenuncia tpEstadoDenuncia) {
		return tpEstadoDenunciaDao.save(tpEstadoDenuncia);
	}

	@Override
	public void delete(Integer id) {
		tpEstadoDenunciaDao.deleteById(id);
	}

	@Override
	public TPEstadoDenuncia update(TPEstadoDenuncia tpEstadoDenuncia) {
		tpEstadoDenunciaDao.deleteById(tpEstadoDenuncia.getCdtpEstadoDenuncia());
		return tpEstadoDenunciaDao.save(tpEstadoDenuncia);
	}

}
