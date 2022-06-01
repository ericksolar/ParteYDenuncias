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
@Table(name ="CausaDetencion")
public class CausaDetencion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDCausaDetencion")
	private Integer idCausaDetencion;
	
	@Column(name ="IDDetencion")
	private Integer idDetencion;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPCausaDetencion", nullable = false)
	private TPCausaDetencion tpCausaDetencion;
	
	@Column(name ="GLDetalle")
	private String glDetalle;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdCausaDetencion() {
		return idCausaDetencion;
	}

	public Integer getIdDetencion() {
		return idDetencion;
	}

	public TPCausaDetencion getTpCausaDetencion() {
		return tpCausaDetencion;
	}

	public String getGlDetalle() {
		return glDetalle;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdCausaDetencion(Integer idCausaDetencion) {
		this.idCausaDetencion = idCausaDetencion;
	}

	public void setIdDetencion(Integer idDetencion) {
		this.idDetencion = idDetencion;
	}

	public void setTpCausaDetencion(TPCausaDetencion tpCausaDetencion) {
		this.tpCausaDetencion = tpCausaDetencion;
	}

	public void setGlDetalle(String glDetalle) {
		this.glDetalle = glDetalle;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
}
