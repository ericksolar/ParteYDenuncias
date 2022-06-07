package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IMedioTransporteDao;
import cl.gestion.models.entity.MedioTransporte;

@Service
public class MedioTransporteServicesImp implements IMedioTransporteServices{
	
	@Autowired
	private IMedioTransporteDao medioTransporteDao;
	
	@Override
	public List<MedioTransporte> findAll() {
		return (List<MedioTransporte>)medioTransporteDao.findAll();
	}

	@Override
	public MedioTransporte findById(Integer id) {
		return medioTransporteDao.findById(id).orElse(null);
	}

	@Override
	public MedioTransporte save(MedioTransporte medioTransporte) {
		return medioTransporteDao.save(medioTransporte);
	}

	@Override
	public void delete(Integer id) {
		medioTransporteDao.deleteById(id);
	}

	@Override
	public MedioTransporte update(MedioTransporte medioTransporte) {
		medioTransporteDao.deleteById(medioTransporte.getIdMedioTransporte());
		return medioTransporteDao.save(medioTransporte);
	}
}
