package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IFiscaliaDao;
import cl.gestion.models.entity.Fiscalia;

@Service
public class FiscaliaServicesImp implements IFiscaliaServices{
	
	@Autowired
	private IFiscaliaDao fiscaliaDao;
	
	@Override
	public List<Fiscalia> findAll() {
		return (List<Fiscalia>)fiscaliaDao.findAll();
	}

	@Override
	public Fiscalia findById(Integer id) {
		return fiscaliaDao.findById(id).orElse(null);
	}

	@Override
	public Fiscalia save(Fiscalia fiscalia) {
		return fiscaliaDao.save(fiscalia);
	}

	@Override
	public void delete(Integer id) {
		fiscaliaDao.deleteById(id);
	}

	@Override
	public Fiscalia update(Fiscalia fiscalia) {
		fiscaliaDao.deleteById(fiscalia.getIdFiscalia());
		return fiscaliaDao.save(fiscalia);
	}

}
