package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.Fiscalia;

public interface IFiscaliaServices {
	
	public List<Fiscalia> findAll();
	
	public Fiscalia findById(Integer id);
	
	public Fiscalia save(Fiscalia fiscalia);
	
	public void delete(Integer id);
	
	public Fiscalia update(Fiscalia fiscalia);
}
