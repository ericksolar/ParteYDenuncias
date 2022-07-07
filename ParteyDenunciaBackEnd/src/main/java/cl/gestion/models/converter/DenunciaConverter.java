package cl.gestion.models.converter;

import java.util.Iterator;

import cl.gestion.models.dto.DenunciaDTO;
import cl.gestion.models.entity.Delito;
import cl.gestion.models.entity.Denuncia;
import cl.gestion.models.entity.DetalleDenuncia;
import cl.gestion.models.entity.EstadoDenuncia;
import cl.gestion.models.entity.Funcionario;
import cl.gestion.models.entity.InstruccionFiscal;
import cl.gestion.models.entity.NarracionDenuncia;

public class DenunciaConverter {

	public Denuncia ConvertDTOtoEntitytoPersist(DenunciaDTO denunciaDTO)
	{
		Denuncia denuncia = new Denuncia();
		denuncia.setIdDenuncia(null);
		
		for(Funcionario funcionario: denunciaDTO.getFuncionario())
		{
			funcionario.setIdFuncionario(null);
			funcionario.setDenuncia(denuncia);
			for(NarracionDenuncia narracionDenuncia: funcionario.getNarracionDenuncia())
			{
				narracionDenuncia.setIdNarracion(null);
				narracionDenuncia.setFuncionario(funcionario);
			}
		}
		
		for(EstadoDenuncia estadoDenuncia: denunciaDTO.getEstadoDenuncia())
		{
			estadoDenuncia.setIdEstadoDenuncia(null);
			estadoDenuncia.setDenuncia(denuncia);
		}
		
		for(InstruccionFiscal instruccionFiscal: denunciaDTO.getInstruccionFiscal())
		{
			instruccionFiscal.setIdInstruccionFiscal(null);
			instruccionFiscal.setDenuncia(denuncia);
		}
		
		for(Delito delito: denunciaDTO.getDelito())
		{
			delito.setIdDelito(null);
			delito.setDenuncia(denuncia);
		}
		
		for(DetalleDenuncia detalleDenuncia: denunciaDTO.getDetalleDenuncia())
		{
			detalleDenuncia.setIdDetalleDenuncia(null);
			detalleDenuncia.setDenuncia(denuncia);
		}
		
		return denuncia;
	}

}
