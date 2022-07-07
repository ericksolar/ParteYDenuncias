package cl.gestion.models.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import cl.gestion.models.entity.CausaDetencion;
import cl.gestion.models.entity.ContactoRedSocial;
import cl.gestion.models.entity.Delito;
import cl.gestion.models.entity.DenunciaPorMenorEdad;
import cl.gestion.models.entity.DenunciaReferencia;
import cl.gestion.models.entity.DetalleDenuncia;
import cl.gestion.models.entity.DetalleImputado;
import cl.gestion.models.entity.Detencion;
import cl.gestion.models.entity.Direccion;
import cl.gestion.models.entity.EstadoDenuncia;
import cl.gestion.models.entity.EstadoInvolucrado;
import cl.gestion.models.entity.Fiscalia;
import cl.gestion.models.entity.Funcionario;
import cl.gestion.models.entity.InstruccionFiscal;
import cl.gestion.models.entity.Involucrado;
import cl.gestion.models.entity.InvolucradoDenunciado;
import cl.gestion.models.entity.MedioTransporteInvolucrado;
import cl.gestion.models.entity.NarracionDenuncia;
import cl.gestion.models.entity.PerfilImputado;
import cl.gestion.models.entity.PersonaParte;
import cl.gestion.models.entity.RolImputado;


public class DenunciaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer idDenuncia;
	private Integer idInstitucionCargo;
	private Date fcIngreso;
	private Integer cdReparticion;
	private Integer nrDocumento;
	private Date fcInicioDenuncia;
	private Date fcTerminoDenuncia;
	private Date fcExpiracion;
	private Integer nrRutUsuario;

	private List<Funcionario> funcionario;
	private List<EstadoDenuncia> estadoDenuncia;
	private List<Delito> delito;
	private List<DetalleDenuncia> detalleDenuncia;
	private List<Involucrado> involucrado;
	private List<DenunciaReferencia> origenDenuncia, ampliacionDenuncia;
	
	private List<NarracionDenuncia> narracionDenuncia;
	private List<Fiscalia> fiscalia;
	private List<InstruccionFiscal> instruccionFiscal;
	private List<Direccion> direccion;
	private List<EstadoInvolucrado> estadoInvolucrado;
	private List<RolImputado> rolImputado;
	private List<DenunciaPorMenorEdad> denunciaPorMenorEdad;
	private List<PerfilImputado> perfilImputado;
	private List<MedioTransporteInvolucrado> medioTransporteInvolucrado;
	private List<DetalleImputado> detalleImputado;
	private List<Detencion> detencion;
	private List<InvolucradoDenunciado> involucradoDenunciado,denunciadoInvolucrado;
	private List<PersonaParte> personaParte;
	private List<ContactoRedSocial> contactoRedSocial;
	private List<CausaDetencion> causaDetencion;
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
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	public List<EstadoDenuncia> getEstadoDenuncia() {
		return estadoDenuncia;
	}
	public List<Delito> getDelito() {
		return delito;
	}
	public List<DetalleDenuncia> getDetalleDenuncia() {
		return detalleDenuncia;
	}
	public List<Involucrado> getInvolucrado() {
		return involucrado;
	}
	public List<DenunciaReferencia> getOrigenDenuncia() {
		return origenDenuncia;
	}
	public List<DenunciaReferencia> getAmpliacionDenuncia() {
		return ampliacionDenuncia;
	}
	public List<NarracionDenuncia> getNarracionDenuncia() {
		return narracionDenuncia;
	}
	public List<Fiscalia> getFiscalia() {
		return fiscalia;
	}
	public List<InstruccionFiscal> getInstruccionFiscal() {
		return instruccionFiscal;
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public List<EstadoInvolucrado> getEstadoInvolucrado() {
		return estadoInvolucrado;
	}
	public List<RolImputado> getRolImputado() {
		return rolImputado;
	}
	public List<DenunciaPorMenorEdad> getDenunciaPorMenorEdad() {
		return denunciaPorMenorEdad;
	}
	public List<PerfilImputado> getPerfilImputado() {
		return perfilImputado;
	}
	public List<MedioTransporteInvolucrado> getMedioTransporteInvolucrado() {
		return medioTransporteInvolucrado;
	}
	public List<DetalleImputado> getDetalleImputado() {
		return detalleImputado;
	}
	public List<Detencion> getDetencion() {
		return detencion;
	}
	public List<InvolucradoDenunciado> getInvolucradoDenunciado() {
		return involucradoDenunciado;
	}
	public List<InvolucradoDenunciado> getDenunciadoInvolucrado() {
		return denunciadoInvolucrado;
	}
	public List<PersonaParte> getPersonaParte() {
		return personaParte;
	}
	public List<ContactoRedSocial> getContactoRedSocial() {
		return contactoRedSocial;
	}
	public List<CausaDetencion> getCausaDetencion() {
		return causaDetencion;
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
	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	public void setEstadoDenuncia(List<EstadoDenuncia> estadoDenuncia) {
		this.estadoDenuncia = estadoDenuncia;
	}
	public void setDelito(List<Delito> delito) {
		this.delito = delito;
	}
	public void setDetalleDenuncia(List<DetalleDenuncia> detalleDenuncia) {
		this.detalleDenuncia = detalleDenuncia;
	}
	public void setInvolucrado(List<Involucrado> involucrado) {
		this.involucrado = involucrado;
	}
	public void setOrigenDenuncia(List<DenunciaReferencia> origenDenuncia) {
		this.origenDenuncia = origenDenuncia;
	}
	public void setAmpliacionDenuncia(List<DenunciaReferencia> ampliacionDenuncia) {
		this.ampliacionDenuncia = ampliacionDenuncia;
	}
	public void setNarracionDenuncia(List<NarracionDenuncia> narracionDenuncia) {
		this.narracionDenuncia = narracionDenuncia;
	}
	public void setFiscalia(List<Fiscalia> fiscalia) {
		this.fiscalia = fiscalia;
	}
	public void setInstruccionFiscal(List<InstruccionFiscal> instruccionFiscal) {
		this.instruccionFiscal = instruccionFiscal;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}
	public void setEstadoInvolucrado(List<EstadoInvolucrado> estadoInvolucrado) {
		this.estadoInvolucrado = estadoInvolucrado;
	}
	public void setRolImputado(List<RolImputado> rolImputado) {
		this.rolImputado = rolImputado;
	}
	public void setDenunciaPorMenorEdad(List<DenunciaPorMenorEdad> denunciaPorMenorEdad) {
		this.denunciaPorMenorEdad = denunciaPorMenorEdad;
	}
	public void setPerfilImputado(List<PerfilImputado> perfilImputado) {
		this.perfilImputado = perfilImputado;
	}
	public void setMedioTransporteInvolucrado(List<MedioTransporteInvolucrado> medioTransporteInvolucrado) {
		this.medioTransporteInvolucrado = medioTransporteInvolucrado;
	}
	public void setDetalleImputado(List<DetalleImputado> detalleImputado) {
		this.detalleImputado = detalleImputado;
	}
	public void setDetencion(List<Detencion> detencion) {
		this.detencion = detencion;
	}
	public void setInvolucradoDenunciado(List<InvolucradoDenunciado> involucradoDenunciado) {
		this.involucradoDenunciado = involucradoDenunciado;
	}
	public void setDenunciadoInvolucrado(List<InvolucradoDenunciado> denunciadoInvolucrado) {
		this.denunciadoInvolucrado = denunciadoInvolucrado;
	}
	public void setPersonaParte(List<PersonaParte> personaParte) {
		this.personaParte = personaParte;
	}
	public void setContactoRedSocial(List<ContactoRedSocial> contactoRedSocial) {
		this.contactoRedSocial = contactoRedSocial;
	}
	public void setCausaDetencion(List<CausaDetencion> causaDetencion) {
		this.causaDetencion = causaDetencion;
	}
	
	
	
}
