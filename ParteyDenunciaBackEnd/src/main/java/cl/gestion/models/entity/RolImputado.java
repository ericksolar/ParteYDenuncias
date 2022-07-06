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
@Table(name ="RolImputado")
public class RolImputado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDRolImputado")
	private Integer idRolImputado;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "rolImputado"})	
	@JoinColumn(name = "IDInvolucrado", nullable = false) 
	private Involucrado involucrado;
	
	@ManyToOne(fetch = FetchType.LAZY) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@JoinColumn(name = "CDTPRolImputado", nullable = false)
	private TPRolImputado tpRolImputado;
	
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

	public Integer getIdRolImputado() {
		return idRolImputado;
	}

	public Involucrado getInvolucrado() {
		return involucrado;
	}

	public TPRolImputado getTpRolImputado() {
		return tpRolImputado;
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

	public void setIdRolImputado(Integer idRolImputado) {
		this.idRolImputado = idRolImputado;
	}

	public void setInvolucrado(Involucrado involucrado) {
		this.involucrado = involucrado;
	}

	public void setTpRolImputado(TPRolImputado tpRolImputado) {
		this.tpRolImputado = tpRolImputado;
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
