package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPFiscaliaDao;
import cl.gestion.models.entity.TPFiscalia;

@Service
public class TPFiscaliaServicesImp implements ITPFiscaliaServices{

	@Autowired
	private ITPFiscaliaDao tpFiscaliaDao;
	
	@Override
	public List<TPFiscalia> findAll() {
		return (List<TPFiscalia>)tpFiscaliaDao.findAll();
	}

	@Override
	public TPFiscalia findById(Integer id) {
		return tpFiscaliaDao.findById(id).orElse(null);
	}

	@Override
	public TPFiscalia save(TPFiscalia tpFiscalia) {
		return tpFiscaliaDao.save(tpFiscalia);
	}

	@Override
	public void delete(Integer id) {
		tpFiscaliaDao.deleteById(id);
	}

	@Override
	public TPFiscalia update(TPFiscalia tpFiscalia) {
		tpFiscaliaDao.deleteById(tpFiscalia.getCdtpFiscalia());
		return tpFiscaliaDao.save(tpFiscalia);
	}

}
