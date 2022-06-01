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
@Table(name ="Fiscalia")
public class Fiscalia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDFiscalia")
	private Integer idFiscalia;
	
	@Column(name ="IDFiscaliaSup")
	private Integer idFiscaliaSup;
	
	@Column(name ="GLMarca")
	private String glMarca;
	
	/**@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPComuna", nullable = false)
	private TPComuna tpComuna;**/
	
	@Column(name ="CDComuna")
	private Integer cdComuna;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLDireccion")
	private String glDireccion;
	
	@Column(name ="NRFono")
	private Integer nrFono;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPFiscalia", nullable = false)
	private TPFiscalia tpFiscalia;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdFiscalia() {
		return idFiscalia;
	}

	public Integer getIdFiscaliaSup() {
		return idFiscaliaSup;
	}

	public String getGlMarca() {
		return glMarca;
	}

	public Integer getCdComuna() {
		return cdComuna;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlDireccion() {
		return glDireccion;
	}

	public Integer getNrFono() {
		return nrFono;
	}

	public TPFiscalia getTpFiscalia() {
		return tpFiscalia;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public void setIdFiscalia(Integer idFiscalia) {
		this.idFiscalia = idFiscalia;
	}

	public void setIdFiscaliaSup(Integer idFiscaliaSup) {
		this.idFiscaliaSup = idFiscaliaSup;
	}

	public void setGlMarca(String glMarca) {
		this.glMarca = glMarca;
	}

	public void setCdComuna(Integer cdComuna) {
		this.cdComuna = cdComuna;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlDireccion(String glDireccion) {
		this.glDireccion = glDireccion;
	}

	public void setNrFono(Integer nrFono) {
		this.nrFono = nrFono;
	}

	public void setTpFiscalia(TPFiscalia tpFiscalia) {
		this.tpFiscalia = tpFiscalia;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}
	
	
}
