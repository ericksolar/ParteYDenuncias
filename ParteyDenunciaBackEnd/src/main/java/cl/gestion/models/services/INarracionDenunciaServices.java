package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.NarracionDenuncia;

public interface INarracionDenunciaServices {
	
	public List<NarracionDenuncia> findAll();
	
	public NarracionDenuncia findById(Integer id);
	
	public NarracionDenuncia save(NarracionDenuncia narracionDenuncia);
	
	public void delete(Integer id);
	
	public NarracionDenuncia update(NarracionDenuncia narracionDenuncia);
}
