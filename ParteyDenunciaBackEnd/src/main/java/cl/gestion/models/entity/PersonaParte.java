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
@Table(name ="PersonaParte")
public class PersonaParte implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDPersonaParte")
	private Integer idPersonaParte;
	
	@Column(name ="IDPersona")
	private Integer idPersona;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="NMSocial")
	private String NMSocial;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "personaParte"})	
	@JoinColumn(name = "IDDireccion") 
	private Direccion direccion;

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
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaParte", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "personaParte"})
	private List<ContactoRedSocial> contactoRedSocial;
	

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

	public Direccion getDireccion() {
		return direccion;
	}

	public String getGlAlias() {
		return glAlias;
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

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setGlAlias(String glAlias) {
		this.glAlias = glAlias;
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

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public List<ContactoRedSocial> getContactoRedSocial() {
		return contactoRedSocial;
	}

	public void setContactoRedSocial(List<ContactoRedSocial> contactoRedSocial) {
		this.contactoRedSocial = contactoRedSocial;
	}
	
}
