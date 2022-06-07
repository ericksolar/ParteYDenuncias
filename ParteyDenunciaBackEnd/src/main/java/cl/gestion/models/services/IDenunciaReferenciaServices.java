package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.DenunciaReferencia;

public interface IDenunciaReferenciaServices {
	
	public List<DenunciaReferencia> findAll();
	
	public DenunciaReferencia findById(Integer id);
	
	public DenunciaReferencia save(DenunciaReferencia denunciaReferencia);
	
	public void delete(Integer id);
	
	public DenunciaReferencia update(DenunciaReferencia denunciaReferencia);
}
