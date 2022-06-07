package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDenunciaReferenciaDao;
import cl.gestion.models.entity.DenunciaReferencia;

@Service
public class DenunciaReferenciaServicesImp implements IDenunciaReferenciaServices{
	
	@Autowired
	private IDenunciaReferenciaDao denunciaReferenciaDao;
	
	@Override
	public List<DenunciaReferencia> findAll() {
		return (List<DenunciaReferencia>)denunciaReferenciaDao.findAll();
	}

	@Override
	public DenunciaReferencia findById(Integer id) {
		return denunciaReferenciaDao.findById(id).orElse(null);
	}

	@Override
	public DenunciaReferencia save(DenunciaReferencia denunciaReferencia) {
		return denunciaReferenciaDao.save(denunciaReferencia);
	}

	@Override
	public void delete(Integer id) {
		denunciaReferenciaDao.deleteById(id);
	}

	@Override
	public DenunciaReferencia update(DenunciaReferencia denunciaReferencia) {
		denunciaReferenciaDao.deleteById(denunciaReferencia.getIdDenunciaReferencia());
		return denunciaReferenciaDao.save(denunciaReferencia);
	}

}
