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
@Table(name ="InvolucradoDenunciado")
public class InvolucradoDenunciado  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDInvolucradoDenunciado")
	private Integer idInvolucradoDenunciado;
	
	@Column(name ="IDInvolucrado")
	private Integer idInvolucrado;
	
	@Column(name ="IDDenunciadoInvolucrado")
	private Integer idDenunciadoInvolucrado;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPRelacion", nullable = false)
	private TPRelacion tpRelacion;
	
	@Column(name ="LGConoceDenunciado")
	private Boolean lgConoceDenunciado;
	
	@Column(name ="GLDescripcionDenunciado")
	private String glDescripcionDenunciado;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdInvolucradoDenunciado() {
		return idInvolucradoDenunciado;
	}

	public Integer getIdInvolucrado() {
		return idInvolucrado;
	}

	public Integer getIdDenunciadoInvolucrado() {
		return idDenunciadoInvolucrado;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public TPRelacion getTpRelacion() {
		return tpRelacion;
	}

	public Boolean getLgConoceDenunciado() {
		return lgConoceDenunciado;
	}

	public String getGlDescripcionDenunciado() {
		return glDescripcionDenunciado;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdInvolucradoDenunciado(Integer idInvolucradoDenunciado) {
		this.idInvolucradoDenunciado = idInvolucradoDenunciado;
	}

	public void setIdInvolucrado(Integer idInvolucrado) {
		this.idInvolucrado = idInvolucrado;
	}

	public void setIdDenunciadoInvolucrado(Integer idDenunciadoInvolucrado) {
		this.idDenunciadoInvolucrado = idDenunciadoInvolucrado;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setTpRelacion(TPRelacion tpRelacion) {
		this.tpRelacion = tpRelacion;
	}

	public void setLgConoceDenunciado(Boolean lgConoceDenunciado) {
		this.lgConoceDenunciado = lgConoceDenunciado;
	}

	public void setGlDescripcionDenunciado(String glDescripcionDenunciado) {
		this.glDescripcionDenunciado = glDescripcionDenunciado;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
}
