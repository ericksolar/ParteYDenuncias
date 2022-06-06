package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPEstadoMigratorioDao;
import cl.gestion.models.entity.TPEstadoMigratorio;

@Service
public class TPEstadoMigratorioServicesImp implements ITPEstadoMigratorioServices{
	
	@Autowired
	private ITPEstadoMigratorioDao tpEstadoMigratorioDao;
	
	@Override
	public List<TPEstadoMigratorio> findAll() {
		return (List<TPEstadoMigratorio>)tpEstadoMigratorioDao.findAll();
	}

	@Override
	public TPEstadoMigratorio findById(Integer id) {
		return tpEstadoMigratorioDao.findById(id).orElse(null);
	}

	@Override
	public TPEstadoMigratorio save(TPEstadoMigratorio tpEstadoMigratorio) {
		return tpEstadoMigratorioDao.save(tpEstadoMigratorio);
	}

	@Override
	public void delete(Integer id) {
		tpEstadoMigratorioDao.deleteById(id);
	}

	@Override
	public TPEstadoMigratorio update(TPEstadoMigratorio tpEstadoMigratorio) {
		tpEstadoMigratorioDao.deleteById(tpEstadoMigratorio.getCdtpEstadoMigratorio());
		return tpEstadoMigratorioDao.save(tpEstadoMigratorio);
	}

}
