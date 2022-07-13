package cl.gestion.models.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import cl.gestion.models.entity.CausaDetencion;
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
import cl.gestion.models.entity.Fiscalia;
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
import cl.gestion.models.entity.TPDocumento;


public class DenunciaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer idDenuncia;
	private Integer idInstitucionCargo;
	private Date fcIngreso;
	private Integer cdReparticion;
	private TPDocumento tpDocumento;
	private Integer nrDocumento;
	private Date fcInicioDenuncia;
	private Date fcTerminoDenuncia;
	private Date fcExpiracion;
	private Integer nrRutUsuario;
	
	private List<Funcionario> funcionario;
	private List<EstadoDenuncia> estadoDenuncia;
	private List<InstruccionFiscal> instruccionFiscal;
	private List<Delito> delito;
	private List<NarracionDenuncia> narracionDenuncia;
	private List<DetalleDenuncia> detalleDenuncia;
	
	private List<Involucrado> involucrado;
	private List<PersonaParte> personaParte;
	private List<Direccion> direccion;
	private List<ContactoRedSocial> contactoRedSocial;
	
	private List<EstadoInvolucrado> estadoInvolucrado;
	private List<RolImputado> rolImputado;
	private List<DenunciaPorMenorEdad> denunciaPorMenorEdad;
	
	private List<PerfilImputado> perfilImputado;

	private List<MedioTransporteInvolucrado> medioTransporteInvolucrado;
	private List<MedioTransporte> medioTransporte;
	private List<EventoMedioTransporte> eventoMedioTransporte;
	
	private List<DetalleImputado> detalleImputado;
//	private List<Detencion> detencion;
//	private List<CausaDetencion> causaDetencion;
	
//	private List<InvolucradoDenunciado> involucradoDenunciado,denunciadoInvolucrado;
//	private List<DenunciaReferencia> origenDenuncia, ampliacionDenuncia;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getIdDenuncia() {
		return idDenuncia;
	}
	public Integer getIdInstitucionCargo() {
		return idInstitucionCargo;
	}
	public Date getFcIngreso() {
		return fcIngreso;
	}
	public Integer getCdReparticion() {
		return cdReparticion;
	}
	public TPDocumento getTpDocumento() {
		return tpDocumento;
	}
	public Integer getNrDocumento() {
		return nrDocumento;
	}
	public Date getFcInicioDenuncia() {
		return fcInicioDenuncia;
	}
	public Date getFcTerminoDenuncia() {
		return fcTerminoDenuncia;
	}
	public Date getFcExpiracion() {
		return fcExpiracion;
	}
	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}
	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}
	public void setIdInstitucionCargo(Integer idInstitucionCargo) {
		this.idInstitucionCargo = idInstitucionCargo;
	}
	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}
	public void setCdReparticion(Integer cdReparticion) {
		this.cdReparticion = cdReparticion;
	}
	public void setTpDocumento(TPDocumento tpDocumento) {
		this.tpDocumento = tpDocumento;
	}
	public void setNrDocumento(Integer nrDocumento) {
		this.nrDocumento = nrDocumento;
	}
	public void setFcInicioDenuncia(Date fcInicioDenuncia) {
		this.fcInicioDenuncia = fcInicioDenuncia;
	}
	public void setFcTerminoDenuncia(Date fcTerminoDenuncia) {
		this.fcTerminoDenuncia = fcTerminoDenuncia;
	}
	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}
	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	public List<EstadoDenuncia> getEstadoDenuncia() {
		return estadoDenuncia;
	}
	public List<InstruccionFiscal> getInstruccionFiscal() {
		return instruccionFiscal;
	}
	public void setEstadoDenuncia(List<EstadoDenuncia> estadoDenuncia) {
		this.estadoDenuncia = estadoDenuncia;
	}
	public void setInstruccionFiscal(List<InstruccionFiscal> instruccionFiscal) {
		this.instruccionFiscal = instruccionFiscal;
	}
	public List<Delito> getDelito() {
		return delito;
	}
	public void setDelito(List<Delito> delito) {
		this.delito = delito;
	}
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	public List<NarracionDenuncia> getNarracionDenuncia() {
		return narracionDenuncia;
	}
	public void setNarracionDenuncia(List<NarracionDenuncia> narracionDenuncia) {
		this.narracionDenuncia = narracionDenuncia;
	}
	public List<DetalleDenuncia> getDetalleDenuncia() {
		return detalleDenuncia;
	}
	public void setDetalleDenuncia(List<DetalleDenuncia> detalleDenuncia) {
		this.detalleDenuncia = detalleDenuncia;
	}
	public List<ContactoRedSocial> getContactoRedSocial() {
		return contactoRedSocial;
	}
	public void setContactoRedSocial(List<ContactoRedSocial> contactoRedSocial) {
		this.contactoRedSocial = contactoRedSocial;
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}
	public List<PersonaParte> getPersonaParte() {
		return personaParte;
	}
	public void setPersonaParte(List<PersonaParte> personaParte) {
		this.personaParte = personaParte;
	}
	public List<Involucrado> getInvolucrado() {
		return involucrado;
	}
	public void setInvolucrado(List<Involucrado> involucrado) {
		this.involucrado = involucrado;
	}
	public List<EstadoInvolucrado> getEstadoInvolucrado() {
		return estadoInvolucrado;
	}
	public void setEstadoInvolucrado(List<EstadoInvolucrado> estadoInvolucrado) {
		this.estadoInvolucrado = estadoInvolucrado;
	}
	public List<RolImputado> getRolImputado() {
		return rolImputado;
	}
	public void setRolImputado(List<RolImputado> rolImputado) {
		this.rolImputado = rolImputado;
	}
	public List<DenunciaPorMenorEdad> getDenunciaPorMenorEdad() {
		return denunciaPorMenorEdad;
	}
	public void setDenunciaPorMenorEdad(List<DenunciaPorMenorEdad> denunciaPorMenorEdad) {
		this.denunciaPorMenorEdad = denunciaPorMenorEdad;
	}
	public List<PerfilImputado> getPerfilImputado() {
		return perfilImputado;
	}
	public void setPerfilImputado(List<PerfilImputado> perfilImputado) {
		this.perfilImputado = perfilImputado;
	}
	public List<DetalleImputado> getDetalleImputado() {
		return detalleImputado;
	}
	public void setDetalleImputado(List<DetalleImputado> detalleImputado) {
		this.detalleImputado = detalleImputado;
	}
	public List<MedioTransporteInvolucrado> getMedioTransporteInvolucrado() {
		return medioTransporteInvolucrado;
	}
	public List<MedioTransporte> getMedioTransporte() {
		return medioTransporte;
	}
	public List<EventoMedioTransporte> getEventoMedioTransporte() {
		return eventoMedioTransporte;
	}
	public void setMedioTransporteInvolucrado(List<MedioTransporteInvolucrado> medioTransporteInvolucrado) {
		this.medioTransporteInvolucrado = medioTransporteInvolucrado;
	}
	public void setMedioTransporte(List<MedioTransporte> medioTransporte) {
		this.medioTransporte = medioTransporte;
	}
	public void setEventoMedioTransporte(List<EventoMedioTransporte> eventoMedioTransporte) {
		this.eventoMedioTransporte = eventoMedioTransporte;
	}
	
	
}
