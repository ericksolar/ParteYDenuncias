package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDenunciaPorMenorEdadDao;
import cl.gestion.models.entity.DenunciaPorMenorEdad;

@Service
public class DenunciaPorMenorEdadServicesImp implements IDenunciaPorMenorEdadServices{
	
	@Autowired
	private IDenunciaPorMenorEdadDao denunciaPorMenorEdadDao;
	
	@Override
	public List<DenunciaPorMenorEdad> findAll() {
		return (List<DenunciaPorMenorEdad>)denunciaPorMenorEdadDao.findAll();
	}

	@Override
	public DenunciaPorMenorEdad findById(Integer id) {
		return denunciaPorMenorEdadDao.findById(id).orElse(null);
	}

	@Override
	public DenunciaPorMenorEdad save(DenunciaPorMenorEdad denunciaPorMenorEdad) {
		return denunciaPorMenorEdadDao.save(denunciaPorMenorEdad);
	}

	@Override
	public void delete(Integer id) {
		denunciaPorMenorEdadDao.deleteById(id);
	}

	@Override
	public DenunciaPorMenorEdad update(DenunciaPorMenorEdad denunciaPorMenorEdad) {
		denunciaPorMenorEdadDao.deleteById(denunciaPorMenorEdad.getIdAdultoProtector());
		return denunciaPorMenorEdadDao.save(denunciaPorMenorEdad);
	}

}
