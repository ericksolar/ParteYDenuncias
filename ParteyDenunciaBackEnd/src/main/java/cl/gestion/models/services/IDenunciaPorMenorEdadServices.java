package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.DenunciaPorMenorEdad;

public interface IDenunciaPorMenorEdadServices {
	
	public List<DenunciaPorMenorEdad> findAll();
	
	public DenunciaPorMenorEdad findById(Integer id);
	
	public DenunciaPorMenorEdad save(DenunciaPorMenorEdad denunciaPorMenorEdad);
	
	public void delete(Integer id);
	
	public DenunciaPorMenorEdad update(DenunciaPorMenorEdad denunciaPorMenorEdad);
}
