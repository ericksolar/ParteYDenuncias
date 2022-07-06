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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Detencion")
public class Detencion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDetencion")
	private Integer idDetencion;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "detencion"})	
	@JoinColumn(name = "IDInvolucrado", nullable = false) 
	private Involucrado involucrado;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLLugarDetencion")
	private String glLugarDetencion;
	
	@Column(name ="FCDetencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcDetencion;
	
	@Column(name ="GLNotificaAdultoResponsable")
	private String glNotificaAdultoResponsable;
	
	@ManyToOne(fetch = FetchType.LAZY) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPMedioNotificacion", nullable = false)
	private TPMedioNotificacion tpMedioNotificacion;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDetencion() {
		return idDetencion;
	}

	public Involucrado getInvolucrado() {
		return involucrado;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlLugarDetencion() {
		return glLugarDetencion;
	}

	public Date getFcDetencion() {
		return fcDetencion;
	}

	public String getGlNotificaAdultoResponsable() {
		return glNotificaAdultoResponsable;
	}

	public TPMedioNotificacion getTpMedioNotificacion() {
		return tpMedioNotificacion;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDetencion(Integer idDetencion) {
		this.idDetencion = idDetencion;
	}

	public void setInvolucrado(Involucrado involucrado) {
		this.involucrado = involucrado;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlLugarDetencion(String glLugarDetencion) {
		this.glLugarDetencion = glLugarDetencion;
	}

	public void setFcDetencion(Date fcDetencion) {
		this.fcDetencion = fcDetencion;
	}

	public void setGlNotificaAdultoResponsable(String glNotificaAdultoResponsable) {
		this.glNotificaAdultoResponsable = glNotificaAdultoResponsable;
	}

	public void setTpMedioNotificacion(TPMedioNotificacion tpMedioNotificacion) {
		this.tpMedioNotificacion = tpMedioNotificacion;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
}
