package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.InstruccionFiscal;

public interface IInstruccionFiscalServices {
	
	public List<InstruccionFiscal> findAll();
	
	public InstruccionFiscal findById(Integer id);
	
	public InstruccionFiscal save(InstruccionFiscal instruccionFiscal);
	
	public void delete(Integer id);
	
	public InstruccionFiscal update(InstruccionFiscal instruccionFiscal);
}
