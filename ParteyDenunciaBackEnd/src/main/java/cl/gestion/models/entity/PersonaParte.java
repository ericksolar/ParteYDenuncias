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
@Table(name ="PersonaParte")
public class PersonaParte implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDPersonaParte")
	private Integer idPersonaParte;
	
	@Column(name ="IDPersona")
	private Integer idPersona;
	
	@Column(name ="IDDireccion")
	private Integer idDireccion;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="NMSocial")
	private String NMSocial;

	@Column(name ="GLAlias")
	private String glAlias;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPEstadoMigratorio", nullable = false)
	private TPEstadoMigratorio tpEstadoMigratorio;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPGradoEscolaridad", nullable = false)
	private TPGradoEscolaridad tpGradoEscolaridad;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPPuebloOriginario", nullable = false)
	private TPPuebloOriginario tpPuebloOriginario;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPIdioma", nullable = false)
	private TPIdioma tpIdioma;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPIdentidadGenero", nullable = false)
	private TPIdentidadGenero tpIdentidadGenero;

	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdPersonaParte() {
		return idPersonaParte;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getNMSocial() {
		return NMSocial;
	}

	public TPEstadoMigratorio getTpEstadoMigratorio() {
		return tpEstadoMigratorio;
	}

	public TPGradoEscolaridad getTpGradoEscolaridad() {
		return tpGradoEscolaridad;
	}

	public TPPuebloOriginario getTpPuebloOriginario() {
		return tpPuebloOriginario;
	}

	public TPIdioma getTpIdioma() {
		return tpIdioma;
	}

	public TPIdentidadGenero getTpIdentidadGenero() {
		return tpIdentidadGenero;
	}

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdPersonaParte(Integer idPersonaParte) {
		this.idPersonaParte = idPersonaParte;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setNMSocial(String nMSocial) {
		NMSocial = nMSocial;
	}

	public void setTpEstadoMigratorio(TPEstadoMigratorio tpEstadoMigratorio) {
		this.tpEstadoMigratorio = tpEstadoMigratorio;
	}

	public void setTpGradoEscolaridad(TPGradoEscolaridad tpGradoEscolaridad) {
		this.tpGradoEscolaridad = tpGradoEscolaridad;
	}

	public void setTpPuebloOriginario(TPPuebloOriginario tpPuebloOriginario) {
		this.tpPuebloOriginario = tpPuebloOriginario;
	}

	public void setTpIdioma(TPIdioma tpIdioma) {
		this.tpIdioma = tpIdioma;
	}

	public void setTpIdentidadGenero(TPIdentidadGenero tpIdentidadGenero) {
		this.tpIdentidadGenero = tpIdentidadGenero;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public String getGlAlias() {
		return glAlias;
	}

	public void setGlAlias(String glAlias) {
		this.glAlias = glAlias;
	}
	
	
	
}
