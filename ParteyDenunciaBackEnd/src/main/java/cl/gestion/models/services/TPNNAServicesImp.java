package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPNNADao;
import cl.gestion.models.entity.TPNNA;

@Service
public class TPNNAServicesImp implements ITPNNAServices{
	
	@Autowired
	private ITPNNADao tpNNADao;
	 
	@Override
	public List<TPNNA> findAll() {
		return (List<TPNNA>)tpNNADao.findAll();
	}

	@Override
	public TPNNA findById(Integer id) {
		return tpNNADao.findById(id).orElse(null);
	}

	@Override
	public TPNNA save(TPNNA tpNNA) {
		return tpNNADao.save(tpNNA);
	}

	@Override
	public void delete(Integer id) {
		tpNNADao.deleteById(id);
	}

	@Override
	public TPNNA update(TPNNA tpNNA) {
		tpNNADao.deleteById(tpNNA.getCdtpNNA());
		return tpNNADao.save(tpNNA);
	}

}
