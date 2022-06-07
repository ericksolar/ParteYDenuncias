package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IInstruccionFiscalDao;
import cl.gestion.models.entity.InstruccionFiscal;

@Service
public class InstruccionFiscalServicesImp implements IInstruccionFiscalServices{
	
	@Autowired
	private IInstruccionFiscalDao instruccionFiscalDao;
	
	@Override
	public List<InstruccionFiscal> findAll() {
		return (List<InstruccionFiscal>)instruccionFiscalDao.findAll();
	}

	@Override
	public InstruccionFiscal findById(Integer id) {
		return instruccionFiscalDao.findById(id).orElse(null);
	}

	@Override
	public InstruccionFiscal save(InstruccionFiscal instruccionFiscal) {
		return instruccionFiscalDao.save(instruccionFiscal);
	}

	@Override
	public void delete(Integer id) {
		instruccionFiscalDao.deleteById(id);
	}

	@Override
	public InstruccionFiscal update(InstruccionFiscal instruccionFiscal) {
		instruccionFiscalDao.deleteById(instruccionFiscal.getIdInstruccionFiscal());
		return instruccionFiscalDao.save(instruccionFiscal);
	}
	
	
}
