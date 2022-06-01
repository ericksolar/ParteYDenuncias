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
@Table(name ="DetalleImputado")
public class DetalleImputado  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDetalleImputado")
	private Integer idDetalleImputado;
	
	@Column(name ="IDInvolucrado")
	private Integer idInvolucrado;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPSituacion", nullable = false)
	private TPSituacionDenuncia tpSituacionDenuncia;
	
	@Column(name ="LGValidaIdentidad")
	private Boolean lgValidaIdentidad;
	
	@Column(name ="LGIdentidadPositiva")
	private Boolean lgIdentidadPositiva;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPConduccion", nullable = false)
	private TPConduccion tpConduccion;
	
	@Column(name ="GLLesiones")
	private String glLesiones;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDetalleImputado() {
		return idDetalleImputado;
	}

	public Integer getIdInvolucrado() {
		return idInvolucrado;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public TPSituacionDenuncia getTpSituacionDenuncia() {
		return tpSituacionDenuncia;
	}

	public Boolean getLgValidaIdentidad() {
		return lgValidaIdentidad;
	}

	public Boolean getLgIdentidadPositiva() {
		return lgIdentidadPositiva;
	}

	public TPConduccion getTpConduccion() {
		return tpConduccion;
	}

	public String getGlLesiones() {
		return glLesiones;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDetalleImputado(Integer idDetalleImputado) {
		this.idDetalleImputado = idDetalleImputado;
	}

	public void setIdInvolucrado(Integer idInvolucrado) {
		this.idInvolucrado = idInvolucrado;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setTpSituacionDenuncia(TPSituacionDenuncia tpSituacionDenuncia) {
		this.tpSituacionDenuncia = tpSituacionDenuncia;
	}

	public void setLgValidaIdentidad(Boolean lgValidaIdentidad) {
		this.lgValidaIdentidad = lgValidaIdentidad;
	}

	public void setLgIdentidadPositiva(Boolean lgIdentidadPositiva) {
		this.lgIdentidadPositiva = lgIdentidadPositiva;
	}

	public void setTpConduccion(TPConduccion tpConduccion) {
		this.tpConduccion = tpConduccion;
	}

	public void setGlLesiones(String glLesiones) {
		this.glLesiones = glLesiones;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
}
