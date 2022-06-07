package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.InvolucradoDenunciado;

public interface IInvolucradoDenunciadoServices {
	
	public List<InvolucradoDenunciado> findAll();
	
	public InvolucradoDenunciado findById(Integer id);
	
	public InvolucradoDenunciado save(InvolucradoDenunciado involucradoDenunciado);
	
	public void delete(Integer id);
	
	public InvolucradoDenunciado update(InvolucradoDenunciado involucradoDenunciado);
}
