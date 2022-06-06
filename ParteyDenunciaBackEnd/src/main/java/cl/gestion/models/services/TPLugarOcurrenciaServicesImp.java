package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPLugarOcurrenciaDao;
import cl.gestion.models.entity.TPLugarOcurrencia;

@Service
public class TPLugarOcurrenciaServicesImp implements ITPLugarOcurrenciaServices{
	
	@Autowired
	private ITPLugarOcurrenciaDao tpLugarOcurrenciaDao;
	
	@Override
	public List<TPLugarOcurrencia> findAll() {
		return (List<TPLugarOcurrencia>)tpLugarOcurrenciaDao.findAll();
	}

	@Override
	public TPLugarOcurrencia findById(Integer id) {
		return tpLugarOcurrenciaDao.findById(id).orElse(null);
	}

	@Override
	public TPLugarOcurrencia save(TPLugarOcurrencia tpLugarOcurrencia) {
		return tpLugarOcurrenciaDao.save(tpLugarOcurrencia);
	}

	@Override
	public void delete(Integer id) {
		tpLugarOcurrenciaDao.deleteById(id);
	}

	@Override
	public TPLugarOcurrencia update(TPLugarOcurrencia tpLugarOcurrencia) {
		tpLugarOcurrenciaDao.deleteById(tpLugarOcurrencia.getCdtpLugarOcurrencia());
		return tpLugarOcurrenciaDao.save(tpLugarOcurrencia);
	}

}
