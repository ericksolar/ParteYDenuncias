package cl.gestion.models.converter;

import java.util.Iterator;

import org.springframework.stereotype.Component;

import cl.gestion.models.dto.DenunciaDTO;
import cl.gestion.models.entity.ContactoRedSocial;
import cl.gestion.models.entity.Delito;
import cl.gestion.models.entity.Denuncia;
import cl.gestion.models.entity.DenunciaPorMenorEdad;
import cl.gestion.models.entity.DenunciaReferencia;
import cl.gestion.models.entity.DetalleDenuncia;
import cl.gestion.models.entity.DetalleImputado;
import cl.gestion.models.entity.Detencion;
import cl.gestion.models.entity.Direccion;
import cl.gestion.models.entity.EstadoDenuncia;
import cl.gestion.models.entity.EstadoInvolucrado;
import cl.gestion.models.entity.EventoMedioTransporte;
import cl.gestion.models.entity.Funcionario;
import cl.gestion.models.entity.InstruccionFiscal;
import cl.gestion.models.entity.Involucrado;
import cl.gestion.models.entity.InvolucradoDenunciado;
import cl.gestion.models.entity.MedioTransporte;
import cl.gestion.models.entity.MedioTransporteInvolucrado;
import cl.gestion.models.entity.NarracionDenuncia;
import cl.gestion.models.entity.PerfilImputado;
import cl.gestion.models.entity.PersonaParte;
import cl.gestion.models.entity.RolImputado;

@Component 
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
			
			Direccion direccion = detalleDenuncia.getDireccion();
			direccion.setIdDireccion(null);
				
			for(PersonaParte personaParte: direccion.getPersonaParte())
			{
				personaParte.setIdPersonaParte(null);
				personaParte.setDireccion(direccion);
					
				for(ContactoRedSocial contactoRedSocial: personaParte.getContactoRedSocial())
				{
					contactoRedSocial.setIdRedSocial(null);
					contactoRedSocial.setPersonaParte(personaParte);
				}
			}
			
		}
		
		for(Involucrado involucrado: denunciaDTO.getInvolucrado())
		{
			involucrado.setIdInvolucrado(null);
			involucrado.setDenuncia(denuncia);
				
			
			Direccion direccion = involucrado.getDireccion();
			direccion.setIdDireccion(null);
			
			for(PersonaParte personaParte: direccion.getPersonaParte())
			{
				personaParte.setIdPersona(null);
				personaParte.setDireccion(direccion);
				
				for(ContactoRedSocial contactoRedSocial: personaParte.getContactoRedSocial())
				{
					contactoRedSocial.setIdRedSocial(null);
					contactoRedSocial.setPersonaParte(personaParte);
				}
			}
			
			for(EstadoInvolucrado estadoInvolucrado: involucrado.getEstadoInvolucrado())
			{
				estadoInvolucrado.setIdEstadoInvolucrado(null);
				estadoInvolucrado.setInvolucrado(involucrado);
			}
			
			for(RolImputado rolImputado: involucrado.getRolImputado())
			{
				rolImputado.setIdRolImputado(null);
				rolImputado.setInvolucrado(involucrado);
			}
			
//			for(DenunciaPorMenorEdad denunciaPorMenorEdad: involucrado.getDenunciaPorMenorEdad())
//			{
//				denunciaPorMenorEdad.setIdDenunciaNNA(null);
//				denunciaPorMenorEdad.setInvolucrado(involucrado);
//			}
			
			for(PerfilImputado perfilImputado: involucrado.getPerfilImputado())
			{
				perfilImputado.setIdPerfilImputado(null);
				perfilImputado.setInvolucrado(involucrado);
			}
			
			for(MedioTransporteInvolucrado medioTransporteInvolucrado: involucrado.getMedioTransporteInvolucrado())
			{
				medioTransporteInvolucrado.setIdMedioTransInvol(null);
				medioTransporteInvolucrado.setInvolucrado(involucrado);
				
				MedioTransporte medioTransporte = medioTransporteInvolucrado.getMedioTransporte();
				medioTransporte.setIdMedioTransporte(null);
				medioTransporteInvolucrado.setMedioTransporte(medioTransporte);
				
				EventoMedioTransporte eventoMedioTransporte = medioTransporte.getEventoMedioTransporte();
				eventoMedioTransporte.setIdEventoMedioTransporte(medioTransporteInvolucrado.getMedioTransporte().getIdMedioTransporte());
				
			}
			
//			for(DetalleImputado detalleImputado: involucrado.getDetalleImputado())
//			{
//				detalleImputado.setIdDetalleImputado(null);
//				detalleImputado.setInvolucrado(involucrado);
//			}
			
//			for(Detencion detencion: involucrado.getDetencion())
//			{
//				detencion.setIdDetencion(null);
//				detencion.setInvolucrado(involucrado);
//			}
			
//			for(InvolucradoDenunciado involucradoDenunciado: involucrado.getInvolucradoDenunciado())
//			{
//				involucradoDenunciado.setIdInvolucradoDenunciado(null);
//				involucradoDenunciado.setInvolucrado(involucrado);
//			}
			
//			for(InvolucradoDenunciado denunciadoInvolucrado: involucrado.getDenunciadoInvolucrado())
//			{
//				denunciadoInvolucrado.setIdInvolucradoDenunciado(null);
//				denunciadoInvolucrado.setInvolucrado(involucrado);
//			}
			
			for(NarracionDenuncia narracionDenuncia: involucrado.getNarracionDenuncia())
			{
				narracionDenuncia.setIdNarracion(null);
				narracionDenuncia.setInvolucrado(involucrado);
			}
		}
//		
//		for(DenunciaReferencia origenDenuncia: denunciaDTO.getOrigenDenuncia()) 
//		{
//			origenDenuncia.setIdDenunciaReferencia(null);
//			origenDenuncia.setDenunciaOrigen(denuncia);
//		}
//		
//		
//		for(DenunciaReferencia ampliacionDenuncia: denunciaDTO.getAmpliacionDenuncia())
//		{
//			ampliacionDenuncia.setIdDenunciaReferencia(null);
//			ampliacionDenuncia.setDenunciaAmpliacion(denuncia);
//		}

		denuncia.setIdInstitucionCargo(denunciaDTO.getIdInstitucionCargo());
		denuncia.setFcIngreso(denunciaDTO.getFcIngreso());
		denuncia.setCdReparticion(denunciaDTO.getCdReparticion());
		denuncia.setTpDocumento(denunciaDTO.getTpDocumento());
		denuncia.setNrDocumento(denunciaDTO.getNrDocumento());
		denuncia.setFcInicioDenuncia(denunciaDTO.getFcInicioDenuncia());
		denuncia.setFcTerminoDenuncia(denunciaDTO.getFcTerminoDenuncia());
		denuncia.setFcExpiracion(denunciaDTO.getFcExpiracion());
		denuncia.setNrRutUsuario(denunciaDTO.getNrRutUsuario());
		
		denuncia.setFuncionario(denunciaDTO.getFuncionario());
		denuncia.setEstadoDenuncia(denunciaDTO.getEstadoDenuncia());
		denuncia.setInstruccionFiscal(denunciaDTO.getInstruccionFiscal());
		denuncia.setDelito(denunciaDTO.getDelito());
		denuncia.setDetalleDenuncia(denunciaDTO.getDetalleDenuncia());
		denuncia.setInvolucrado(denunciaDTO.getInvolucrado());
//		denuncia.setOrigenDenuncia(denunciaDTO.getOrigenDenuncia());
//		denuncia.setAmpliacionDenuncia(denunciaDTO.getAmpliacionDenuncia());
		
		
		return denuncia;
	}
	
	public DenunciaDTO ConvertEntitytoDTO(Denuncia denuncia)
	{
		
		DenunciaDTO denunciaDTO = new DenunciaDTO();
		denunciaDTO.setIdDenuncia(denuncia.getIdDenuncia());
		denunciaDTO.setFcExpiracion(denuncia.getFcExpiracion());
		
		return denunciaDTO;
	}
}
