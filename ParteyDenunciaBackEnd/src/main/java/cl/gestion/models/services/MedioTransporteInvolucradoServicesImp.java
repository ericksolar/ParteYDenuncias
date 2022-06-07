package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IMedioTransporteInvolucradoDao;
import cl.gestion.models.entity.MedioTransporteInvolucrado;

@Service
public class MedioTransporteInvolucradoServicesImp implements IMedioTransporteInvolucradoServices{
	
	@Autowired
	private IMedioTransporteInvolucradoDao medioTransporteInvolucradoDao;
	
	@Override
	public List<MedioTransporteInvolucrado> findAll() {
		return (List<MedioTransporteInvolucrado>)medioTransporteInvolucradoDao.findAll();
	}

	@Override
	public MedioTransporteInvolucrado findById(Integer id) {
		return medioTransporteInvolucradoDao.findById(id).orElse(null);
	}

	@Override
	public MedioTransporteInvolucrado save(MedioTransporteInvolucrado medioTransporteInvolucrado) {
		return medioTransporteInvolucradoDao.save(medioTransporteInvolucrado);
	}

	@Override
	public void delete(Integer id) {
		medioTransporteInvolucradoDao.deleteById(id);
	}

	@Override
	public MedioTransporteInvolucrado update(MedioTransporteInvolucrado medioTransporteInvolucrado) {
		medioTransporteInvolucradoDao.deleteById(medioTransporteInvolucrado.getIdMedioTransInvol());
		return medioTransporteInvolucradoDao.save(medioTransporteInvolucrado);
	}
	
}
