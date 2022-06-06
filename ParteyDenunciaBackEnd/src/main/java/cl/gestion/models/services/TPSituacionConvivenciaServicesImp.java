package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPSituacionConvivenciaDao;
import cl.gestion.models.entity.TPSituacionConvivencia;

@Service
public class TPSituacionConvivenciaServicesImp implements ITPSituacionConvivenciaServices{

	@Autowired
	private ITPSituacionConvivenciaDao tpSituacionConvivenciaDao;
	
	@Override
	public List<TPSituacionConvivencia> findAll() {
		return (List<TPSituacionConvivencia>)tpSituacionConvivenciaDao.findAll();
	}

	@Override
	public TPSituacionConvivencia findById(Integer id) {
		return tpSituacionConvivenciaDao.findById(id).orElse(null);
	}

	@Override
	public TPSituacionConvivencia save(TPSituacionConvivencia tpEstadoMigratorio) {
		return tpSituacionConvivenciaDao.save(tpEstadoMigratorio);
	}

	@Override
	public void delete(Integer id) {
		tpSituacionConvivenciaDao.deleteById(id);
	}

	@Override
	public TPSituacionConvivencia update(TPSituacionConvivencia tpEstadoMigratorio) {
		tpSituacionConvivenciaDao.deleteById(tpEstadoMigratorio.getCdtpSituacionConvivencia());
		return tpSituacionConvivenciaDao.save(tpEstadoMigratorio);
	}

}
