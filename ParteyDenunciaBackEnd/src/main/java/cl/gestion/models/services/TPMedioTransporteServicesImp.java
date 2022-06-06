package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPMedioTransporteDao;
import cl.gestion.models.entity.TPMedioTransporte;

@Service
public class TPMedioTransporteServicesImp implements ITPMedioTransporteServices{
	
	@Autowired
	private ITPMedioTransporteDao tpMedioTransporteDao;
	
	@Override
	public List<TPMedioTransporte> findAll() {
		return (List<TPMedioTransporte>)tpMedioTransporteDao.findAll();
	}

	@Override
	public TPMedioTransporte findById(Integer id) {
		return tpMedioTransporteDao.findById(id).orElse(null);
	}

	@Override
	public TPMedioTransporte save(TPMedioTransporte tpMedioTransporte) {
		return tpMedioTransporteDao.save(tpMedioTransporte);
	}

	@Override
	public void delete(Integer id) {
		tpMedioTransporteDao.deleteById(id);
	}

	@Override
	public TPMedioTransporte update(TPMedioTransporte tpMedioTransporte) {
		tpMedioTransporteDao.deleteById(tpMedioTransporte.getCdtpMedioTransporte());
		return tpMedioTransporteDao.save(tpMedioTransporte);
	}

}
