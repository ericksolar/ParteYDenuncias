package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="Denuncia")
public class Denuncia  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDenuncia")
	private Integer idDenuncia;
	
	@Column(name ="IDInstitucionCargo")
	private Integer idInstitucionCargo;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="CDReparticion")
	private Integer cdReparticion;
	
	@ManyToOne(fetch = FetchType.LAZY) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPDocumento")
	private TPDocumento tpDocumento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denuncia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denuncia"})
	private List<Funcionario> funcionario;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denuncia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denuncia"})
	private List<EstadoDenuncia> estadoDenuncia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denuncia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denuncia"})
	private List<InstruccionFiscal> instruccionFiscal;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denuncia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denuncia"})
	private List<Delito> delito;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denuncia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denuncia"})
	private List<DetalleDenuncia> detalleDenuncia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denuncia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denuncia"})
	private List<Involucrado> involucrado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denunciaOrigen", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denunciaOrigen","denunciaAmpliacion"})
	private List<DenunciaReferencia> origenDenuncia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "denunciaAmpliacion", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denunciaOrigen","denunciaAmpliacion"})
	private List<DenunciaReferencia> ampliacionDenuncia;
	
	@Column(name ="NRDocumento")
	private Integer nrDocumento;
	
	@Column(name ="FCInicioDenuncia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicioDenuncia;
	
	@Column(name ="FCTerminoDenuncia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcTerminoDenuncia;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

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

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public List<EstadoDenuncia> getEstadoDenuncia() {
		return estadoDenuncia;
	}

	public List<InstruccionFiscal> getInstruccionFiscal() {
		return instruccionFiscal;
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

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public void setEstadoDenuncia(List<EstadoDenuncia> estadoDenuncia) {
		this.estadoDenuncia = estadoDenuncia;
	}

	public void setInstruccionFiscal(List<InstruccionFiscal> instruccionFiscal) {
		this.instruccionFiscal = instruccionFiscal;
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

	public List<DenunciaReferencia> getOrigenDenuncia() {
		return origenDenuncia;
	}

	public List<DenunciaReferencia> getAmpliacionDenuncia() {
		return ampliacionDenuncia;
	}

	public void setOrigenDenuncia(List<DenunciaReferencia> origenDenuncia) {
		this.origenDenuncia = origenDenuncia;
	}

	public void setAmpliacionDenuncia(List<DenunciaReferencia> ampliacionDenuncia) {
		this.ampliacionDenuncia = ampliacionDenuncia;
	}
	
}
