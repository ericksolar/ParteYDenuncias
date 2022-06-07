package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.INarracionDenunciaDao;
import cl.gestion.models.entity.NarracionDenuncia;

@Service
public class NarracionDenunciaServicesImp implements INarracionDenunciaServices{
	
	@Autowired
	private INarracionDenunciaDao narracionDenunciaDao;
	
	@Override
	public List<NarracionDenuncia> findAll() {
		return (List<NarracionDenuncia>)narracionDenunciaDao.findAll();
	}

	@Override
	public NarracionDenuncia findById(Integer id) {
		return narracionDenunciaDao.findById(id).orElse(null);
	}

	@Override
	public NarracionDenuncia save(NarracionDenuncia narracionDenuncia) {
		return narracionDenunciaDao.save(narracionDenuncia);
	}

	@Override
	public void delete(Integer id) {
		narracionDenunciaDao.deleteById(id);
	}

	@Override
	public NarracionDenuncia update(NarracionDenuncia narracionDenuncia) {
		narracionDenunciaDao.deleteById(narracionDenuncia.getIdNarracion());
		return narracionDenunciaDao.save(narracionDenuncia);
	}

}
