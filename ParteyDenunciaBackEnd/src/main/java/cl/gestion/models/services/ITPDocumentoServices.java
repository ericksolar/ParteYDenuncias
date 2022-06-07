package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPDocumento;

public interface ITPDocumentoServices {
	
	public List<TPDocumento> findAll();
	
	public TPDocumento findById(Integer id);
	
	public TPDocumento save(TPDocumento tpDocumento);
	
	public void delete(Integer id);
	
	public TPDocumento update(TPDocumento tpDocumento);
}
