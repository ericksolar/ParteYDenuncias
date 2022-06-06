package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPPuebloOriginarioDao;
import cl.gestion.models.entity.TPPuebloOriginario;

@Service
public class TPPuebloOriginarioServicesImp implements ITPPuebloOriginarioServices{

	@Autowired
	private ITPPuebloOriginarioDao tpPuebloOriginarioDao;
	
	@Override
	public List<TPPuebloOriginario> findAll() {
		return (List<TPPuebloOriginario>)tpPuebloOriginarioDao.findAll();
	}

	@Override
	public TPPuebloOriginario findById(Integer id) {
		return tpPuebloOriginarioDao.findById(id).orElse(null);
	}

	@Override
	public TPPuebloOriginario save(TPPuebloOriginario tpPuebloOriginario) {
		return tpPuebloOriginarioDao.save(tpPuebloOriginario);
	}

	@Override
	public void delete(Integer id) {
		tpPuebloOriginarioDao.deleteById(id);
	}

	@Override
	public TPPuebloOriginario update(TPPuebloOriginario tpPuebloOriginario) {
		tpPuebloOriginarioDao.deleteById(tpPuebloOriginario.getCdtpPuebloOriginario());
		return tpPuebloOriginarioDao.save(tpPuebloOriginario);
	}

}
