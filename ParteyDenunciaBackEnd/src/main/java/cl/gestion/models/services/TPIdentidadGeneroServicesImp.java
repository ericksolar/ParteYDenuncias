package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPIdentidadGeneroDao;
import cl.gestion.models.entity.TPIdentidadGenero;

@Service
public class TPIdentidadGeneroServicesImp implements ITPIdentidadGeneroServices{
	
	@Autowired
	private ITPIdentidadGeneroDao tpIdentidadGeneroDao;
	
	@Override
	public List<TPIdentidadGenero> findAll() {
		return (List<TPIdentidadGenero>)tpIdentidadGeneroDao.findAll();
	}

	@Override
	public TPIdentidadGenero findById(Integer id) {
		return tpIdentidadGeneroDao.findById(id).orElse(null);
	}

	@Override
	public TPIdentidadGenero save(TPIdentidadGenero tpIdentidadGenero) {
		return tpIdentidadGeneroDao.save(tpIdentidadGenero);
	}

	@Override
	public void delete(Integer id) {
		tpIdentidadGeneroDao.deleteById(id);
	}

	@Override
	public TPIdentidadGenero update(TPIdentidadGenero tpIdentidadGenero) {
		tpIdentidadGeneroDao.deleteById(tpIdentidadGenero.getCdtpIdentidadGenero());
		return tpIdentidadGeneroDao.save(tpIdentidadGenero);
	}

}
