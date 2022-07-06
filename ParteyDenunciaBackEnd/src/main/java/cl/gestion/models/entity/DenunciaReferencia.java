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
@Table(name ="DenunciaReferencia")
public class DenunciaReferencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDenunciaReferencia")
	private Integer idDenunciaReferencia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denunciaReferencia"})	
	@JoinColumn(name = "IDDenunciaOrigen", nullable = false) 
	private Denuncia denunciaOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denunciaReferencia"})	
	@JoinColumn(name = "IDDenunciaAmpliacion", nullable = false) 
	private Denuncia denunciaAmpliacion;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDenunciaReferencia() {
		return idDenunciaReferencia;
	}

	public Denuncia getDenunciaAmpliacion() {
		return denunciaAmpliacion;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDenunciaReferencia(Integer idDenunciaReferencia) {
		this.idDenunciaReferencia = idDenunciaReferencia;
	}

	public void setDenunciaAmpliacion(Denuncia denunciaAmpliacion) {
		this.denunciaAmpliacion = denunciaAmpliacion;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public Denuncia getDenunciaOrigen() {
		return denunciaOrigen;
	}

	public void setDenunciaOrigen(Denuncia denunciaOrigen) {
		this.denunciaOrigen = denunciaOrigen;
	}
	
	
}
