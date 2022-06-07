package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPDocumentoDao;
import cl.gestion.models.entity.TPDocumento;

@Service
public class TPDocumentoServicesImp implements ITPDocumentoServices{
	
	@Autowired
	private ITPDocumentoDao tpDocumentoDao;
	
	@Override
	public List<TPDocumento> findAll() {
		return (List<TPDocumento>)tpDocumentoDao.findAll();
	}

	@Override
	public TPDocumento findById(Integer id) {
		return tpDocumentoDao.findById(id).orElse(null);
	}

	@Override
	public TPDocumento save(TPDocumento tpDocumento) {
		return tpDocumentoDao.save(tpDocumento);
	}

	@Override
	public void delete(Integer id) {
		tpDocumentoDao.deleteById(id);
	}

	@Override
	public TPDocumento update(TPDocumento tpDocumento) {
		tpDocumentoDao.deleteById(tpDocumento.getCdtpDocumento());
		return tpDocumentoDao.save(tpDocumento);
	}

}
