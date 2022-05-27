package cl.gestion.parteydenuncia.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.parteydenuncia.models.dao.ITPSituacionDenunciaDao;
import cl.gestion.parteydenuncia.models.entity.TPSituacionDenuncia;

@Service
public class TPSituacionDenunciaServicesImpl implements ITPSituacionDenunciaServices{

	@Autowired
	private ITPSituacionDenunciaDao tpSituacionDenunciaDao;

	@Override
	public List<TPSituacionDenuncia> findAll() {
		return (List<TPSituacionDenuncia>) tpSituacionDenunciaDao.findAll();
	}
}
