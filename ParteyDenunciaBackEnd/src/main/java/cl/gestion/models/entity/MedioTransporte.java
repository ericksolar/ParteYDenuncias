package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="MedioTransporte")
public class MedioTransporte implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDMedioTransporte")
	private Integer idMedioTransporte;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPUsoMedio", nullable = false)
	private TPUsoMedio tpUsoMedio;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPMedioTransporte", nullable = false)
	private TPMedioTransporte tpMedioTransporte;
	
	@Column(name ="IDMovil")
	private Integer idMovil;
	
	@Column(name ="LGEncargoRobo")
	private Boolean lgEncargoRobo;
	
	@Column(name ="LGIncautado")
	private Boolean lgIncautado;
	
	@Column(name ="LGPortaPatente")
	private Boolean lgPortaPatente;
	
	@Column(name ="GLNroEncargoRobo")
	private String glNroEncargoRobo;
	
	@Column(name ="GLPatente")
	private String glPatente;
	
	@Column(name ="GLMarca")
	private String glMarca;
	
	@Column(name ="GLModelo")
	private String glModelo;
	
	@Column(name ="GLColor")
	private String glColor;
	
	@Column(name ="GLPeaje")
	private String glPeaje;
	
	@Column(name ="GLAutopista")
	private String glAutopista;
	
	@Column(name ="GLObservacion")
	private String glObservacion;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdMedioTransporte() {
		return idMedioTransporte;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public TPUsoMedio getTpUsoMedio() {
		return tpUsoMedio;
	}

	public TPMedioTransporte getTpMedioTransporte() {
		return tpMedioTransporte;
	}

	public Integer getIdMovil() {
		return idMovil;
	}

	public Boolean getLgEncargoRobo() {
		return lgEncargoRobo;
	}

	public Boolean getLgIncautado() {
		return lgIncautado;
	}

	public Boolean getLgPortaPatente() {
		return lgPortaPatente;
	}

	public String getGlNroEncargoRobo() {
		return glNroEncargoRobo;
	}

	public String getGlPatente() {
		return glPatente;
	}

	public String getGlMarca() {
		return glMarca;
	}

	public String getGlModelo() {
		return glModelo;
	}

	public String getGlColor() {
		return glColor;
	}

	public String getGlPeaje() {
		return glPeaje;
	}

	public String getGlAutopista() {
		return glAutopista;
	}

	public String getGlObservacion() {
		return glObservacion;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdMedioTransporte(Integer idMedioTransporte) {
		this.idMedioTransporte = idMedioTransporte;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setTpUsoMedio(TPUsoMedio tpUsoMedio) {
		this.tpUsoMedio = tpUsoMedio;
	}

	public void setTpMedioTransporte(TPMedioTransporte tpMedioTransporte) {
		this.tpMedioTransporte = tpMedioTransporte;
	}

	public void setIdMovil(Integer idMovil) {
		this.idMovil = idMovil;
	}

	public void setLgEncargoRobo(Boolean lgEncargoRobo) {
		this.lgEncargoRobo = lgEncargoRobo;
	}

	public void setLgIncautado(Boolean lgIncautado) {
		this.lgIncautado = lgIncautado;
	}

	public void setLgPortaPatente(Boolean lgPortaPatente) {
		this.lgPortaPatente = lgPortaPatente;
	}

	public void setGlNroEncargoRobo(String glNroEncargoRobo) {
		this.glNroEncargoRobo = glNroEncargoRobo;
	}

	public void setGlPatente(String glPatente) {
		this.glPatente = glPatente;
	}

	public void setGlMarca(String glMarca) {
		this.glMarca = glMarca;
	}

	public void setGlModelo(String glModelo) {
		this.glModelo = glModelo;
	}

	public void setGlColor(String glColor) {
		this.glColor = glColor;
	}

	public void setGlPeaje(String glPeaje) {
		this.glPeaje = glPeaje;
	}

	public void setGlAutopista(String glAutopista) {
		this.glAutopista = glAutopista;
	}

	public void setGlObservacion(String glObservacion) {
		this.glObservacion = glObservacion;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
	
}
