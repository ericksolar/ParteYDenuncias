package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPContactoDenunciaDao;
import cl.gestion.models.entity.TPContactoDenuncia;

@Service
public class TPContactoDenunciaServicesImp implements ITPContactoDenunciaServices{
	
	@Autowired
	private ITPContactoDenunciaDao tpContactoDenunciaDao;
	
	@Override
	public List<TPContactoDenuncia> findAll() {
		return (List<TPContactoDenuncia>)tpContactoDenunciaDao.findAll();
	}

	@Override
	public TPContactoDenuncia findById(Integer id) {
		return tpContactoDenunciaDao.findById(id).orElse(null);
	}

	@Override
	public TPContactoDenuncia save(TPContactoDenuncia tpContactoDenuncia) {
		return tpContactoDenunciaDao.save(tpContactoDenuncia);
	}

	@Override
	public void delete(Integer id) {
		tpContactoDenunciaDao.deleteById(id);
	}

	@Override
	public TPContactoDenuncia update(TPContactoDenuncia tpContactoDenuncia) {
		tpContactoDenunciaDao.deleteById(tpContactoDenuncia.getCdtpContactoDenuncia());
		return tpContactoDenunciaDao.save(tpContactoDenuncia);
	}

}
