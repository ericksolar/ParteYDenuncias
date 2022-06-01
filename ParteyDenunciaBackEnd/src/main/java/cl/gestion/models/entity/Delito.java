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
@Table(name ="Delito")
public class Delito implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDelito")
	private Integer idDelito;
	
	@Column(name ="IDDenuncia")
	private Integer idDenuncia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPGradoEjecucion", nullable = false)
	private TPGradoEjecucion tpGradoEjecucion;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;

	@Column(name ="GLModusOperandi")
	private String glModusOperandi;
	
	@Column(name ="LGLesionados")
	private Boolean lgLesionados;
	
	@Column(name ="LGFallecidos")
	private Boolean lgFallecidos;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDelito() {
		return idDelito;
	}

	public Integer getIdDenuncia() {
		return idDenuncia;
	}

	public TPGradoEjecucion getTpGradoEjecucion() {
		return tpGradoEjecucion;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlModusOperandi() {
		return glModusOperandi;
	}

	public Boolean getLgLesionados() {
		return lgLesionados;
	}

	public Boolean getLgFallecidos() {
		return lgFallecidos;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDelito(Integer idDelito) {
		this.idDelito = idDelito;
	}

	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public void setTpGradoEjecucion(TPGradoEjecucion tpGradoEjecucion) {
		this.tpGradoEjecucion = tpGradoEjecucion;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlModusOperandi(String glModusOperandi) {
		this.glModusOperandi = glModusOperandi;
	}

	public void setLgLesionados(Boolean lgLesionados) {
		this.lgLesionados = lgLesionados;
	}

	public void setLgFallecidos(Boolean lgFallecidos) {
		this.lgFallecidos = lgFallecidos;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
}
