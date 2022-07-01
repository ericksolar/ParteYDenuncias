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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Involucrado")
public class Involucrado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDInvolucrado")
	private Integer idInvolucrado;
	
	@Column(name ="IDPersonaParte")
	private Integer idPersonaParte;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})	
	@JoinColumn(name = "IDDenuncia", nullable = false) 
	private Denuncia denuncia;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})	
	@JoinColumn(name = "IDDireccion", nullable = false) 
	private Direccion direccion;

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPContactoDenuncia", nullable = false)
	private TPContactoDenuncia tpContactoDenuncia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPSituacionConvivencia", nullable = false)
	private TPSituacionConvivencia tpSituacionConvivencia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPInvolucrado", nullable = false)
	private TPInvolucrado tpInvolucrado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<EstadoInvolucrado> estadoInvolucrado;
	
	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<Detencion> detencion;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<MedioTransporteInvolucrado> medioTransporteInvolucrado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<NarracionDenuncia> narracionDenuncia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<DenunciaPorMenorEdad> denunciaPorMenorEdad;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<InvolucradoDenunciado> involucradoDenunciado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<RolImputado> rolImputado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<PerfilImputado> perfilImputado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "involucrado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "involucrado"})
	private List<DetalleImputado> DetalleImputado;
	*/
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLDetalleLesiones")
	private String glDetalleLesiones;
	
	@Column(name ="GLOtrosTestigos")
	private String glOtrosTestigos;
	
	@Column(name ="GLPruebaHechos")
	private String glPruebaHechos;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdInvolucrado() {
		return idInvolucrado;
	}

	public Integer getIdPersonaParte() {
		return idPersonaParte;
	}

	public Denuncia getDenuncia() {
		return denuncia;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public TPContactoDenuncia getTpContactoDenuncia() {
		return tpContactoDenuncia;
	}

	public TPSituacionConvivencia getTpSituacionConvivencia() {
		return tpSituacionConvivencia;
	}

	public TPInvolucrado getTpInvolucrado() {
		return tpInvolucrado;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlDetalleLesiones() {
		return glDetalleLesiones;
	}

	public String getGlOtrosTestigos() {
		return glOtrosTestigos;
	}

	public String getGlPruebaHechos() {
		return glPruebaHechos;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdInvolucrado(Integer idInvolucrado) {
		this.idInvolucrado = idInvolucrado;
	}

	public void setIdPersonaParte(Integer idPersonaParte) {
		this.idPersonaParte = idPersonaParte;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setTpContactoDenuncia(TPContactoDenuncia tpContactoDenuncia) {
		this.tpContactoDenuncia = tpContactoDenuncia;
	}

	public void setTpSituacionConvivencia(TPSituacionConvivencia tpSituacionConvivencia) {
		this.tpSituacionConvivencia = tpSituacionConvivencia;
	}

	public void setTpInvolucrado(TPInvolucrado tpInvolucrado) {
		this.tpInvolucrado = tpInvolucrado;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlDetalleLesiones(String glDetalleLesiones) {
		this.glDetalleLesiones = glDetalleLesiones;
	}

	public void setGlOtrosTestigos(String glOtrosTestigos) {
		this.glOtrosTestigos = glOtrosTestigos;
	}

	public void setGlPruebaHechos(String glPruebaHechos) {
		this.glPruebaHechos = glPruebaHechos;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public List<EstadoInvolucrado> getEstadoInvolucrado() {
		return estadoInvolucrado;
	}

	public void setEstadoInvolucrado(List<EstadoInvolucrado> estadoInvolucrado) {
		this.estadoInvolucrado = estadoInvolucrado;
	}
	
	
}
