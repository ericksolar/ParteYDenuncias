package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.gestion.models.dao.ITPSituacionDenunciaDao;
import cl.gestion.models.entity.TPSituacionDenuncia;

@Service
public class TPSituacionDenunciaServicesImp implements ITPSituacionDenunciaServices{

	@Autowired
	private ITPSituacionDenunciaDao tpSituacionDenunciaDao;

	@Override
	public List<TPSituacionDenuncia> findAll() {
		return (List<TPSituacionDenuncia>) tpSituacionDenunciaDao.findAll();
	}

	@Override
	public TPSituacionDenuncia findById(Integer id) {
		return tpSituacionDenunciaDao.findById(id).orElse(null);
	}

	@Override
	public TPSituacionDenuncia save(TPSituacionDenuncia tpSituacionDenuncia) {
		return tpSituacionDenunciaDao.save(tpSituacionDenuncia);
	}

	@Override
	public void delete(Integer id) {
		tpSituacionDenunciaDao.deleteById(id);
	}

	@Override
	public TPSituacionDenuncia update(TPSituacionDenuncia tpSituacionDenuncia) {
		tpSituacionDenunciaDao.deleteById(tpSituacionDenuncia.getCdtpSituacion());
		return null;
	}
}
