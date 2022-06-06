package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPResidenciaDao;
import cl.gestion.models.entity.TPResidencia;

@Service
public class TPResidenciaServicesImp implements ITPResidenciaServices{

	@Autowired
	private ITPResidenciaDao tpResidenciaDao;
	
	@Override
	public List<TPResidencia> findAll() {
		return (List<TPResidencia>)tpResidenciaDao.findAll();
	}

	@Override
	public TPResidencia findById(Integer id) {
		return tpResidenciaDao.findById(id).orElse(null);
	}

	@Override
	public TPResidencia save(TPResidencia tpResidencia) {
		return tpResidenciaDao.save(tpResidencia);
	}

	@Override
	public void delete(Integer id) {
		tpResidenciaDao.deleteById(id);
	}

	@Override
	public TPResidencia update(TPResidencia tpResidencia) {
		tpResidenciaDao.deleteById(tpResidencia.getCdtpResidencia());
		return tpResidenciaDao.save(tpResidencia);
	}

}
