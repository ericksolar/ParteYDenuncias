package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="DenunciaReferencia")
public class DenunciaReferencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDenunciaReferencia")
	private Integer idDenunciaReferencia;
	
	@Column(name ="IDDenunciaOrigen")
	private Integer idDenunciaOrigen;
	
	@Column(name ="IDDenunciaAmpliacion")
	private Integer idDenunciaAmpliacion;
	
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

	public Integer getIdDenunciaOrigen() {
		return idDenunciaOrigen;
	}

	public Integer getIdDenunciaAmpliacion() {
		return idDenunciaAmpliacion;
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

	public void setIdDenunciaOrigen(Integer idDenunciaOrigen) {
		this.idDenunciaOrigen = idDenunciaOrigen;
	}

	public void setIdDenunciaAmpliacion(Integer idDenunciaAmpliacion) {
		this.idDenunciaAmpliacion = idDenunciaAmpliacion;
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
	
}
