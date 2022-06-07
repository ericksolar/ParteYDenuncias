package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDetalleDenunciaDao;
import cl.gestion.models.entity.DetalleDenuncia;

@Service
public class DetalleDenunciaServicesImp implements IDetalleDenunciaServices{
	
	@Autowired
	private IDetalleDenunciaDao detalleDenunciaDao;
	
	@Override
	public List<DetalleDenuncia> findAll() {
		return (List<DetalleDenuncia>)detalleDenunciaDao.findAll();
	}

	@Override
	public DetalleDenuncia findById(Integer id) {
		return detalleDenunciaDao.findById(id).orElse(null);
	}

	@Override
	public DetalleDenuncia save(DetalleDenuncia detalleDenuncia) {
		return detalleDenunciaDao.save(detalleDenuncia);
	}

	@Override
	public void delete(Integer id) {
		detalleDenunciaDao.deleteById(id);
	}

	@Override
	public DetalleDenuncia update(DetalleDenuncia detalleDenuncia) {
		detalleDenunciaDao.deleteById(detalleDenuncia.getIdDetalleDenuncia());
		return detalleDenunciaDao.save(detalleDenuncia);
	}

}
