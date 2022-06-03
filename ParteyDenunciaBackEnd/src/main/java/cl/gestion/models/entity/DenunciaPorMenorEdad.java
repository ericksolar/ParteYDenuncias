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
@Table(name ="DenunciaPorMenorEdad")
public class DenunciaPorMenorEdad  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDenunciaNNA")
	private Integer idDenunciaNNA;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "denunciaPorMenorEdad"})	
	@JoinColumn(name = "IDInvolucradoDenunciante", nullable = false) 
	private Involucrado involucrado;
	
	@Column(name ="IDAdultoProtector")
	private Integer idAdultoProtector;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPNNA", nullable = false)
	private TPNNA tpNNA;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPRelacion", nullable = false)
	private TPRelacion tpRelacion;
	
	@Column(name ="LGAdultoProtector")
	private Boolean lgAdultoProtector;
	
	@Column(name ="GLPersonaRelata")
	private String glPersonaRelata;
	
	@Column(name ="GLConoceHechos")
	private String glConoceHechos;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDenunciaNNA() {
		return idDenunciaNNA;
	}

	public Involucrado getInvolucrado() {
		return involucrado;
	}

	public Integer getIdAdultoProtector() {
		return idAdultoProtector;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public TPNNA getTpNNA() {
		return tpNNA;
	}

	public TPRelacion getTpRelacion() {
		return tpRelacion;
	}

	public Boolean getLgAdultoProtector() {
		return lgAdultoProtector;
	}

	public String getGlPersonaRelata() {
		return glPersonaRelata;
	}

	public String getGlConoceHechos() {
		return glConoceHechos;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDenunciaNNA(Integer idDenunciaNNA) {
		this.idDenunciaNNA = idDenunciaNNA;
	}

	public void setInvolucrado(Involucrado involucrado) {
		this.involucrado = involucrado;
	}

	public void setIdAdultoProtector(Integer idAdultoProtector) {
		this.idAdultoProtector = idAdultoProtector;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setTpNNA(TPNNA tpNNA) {
		this.tpNNA = tpNNA;
	}

	public void setTpRelacion(TPRelacion tpRelacion) {
		this.tpRelacion = tpRelacion;
	}

	public void setLgAdultoProtector(Boolean lgAdultoProtector) {
		this.lgAdultoProtector = lgAdultoProtector;
	}

	public void setGlPersonaRelata(String glPersonaRelata) {
		this.glPersonaRelata = glPersonaRelata;
	}

	public void setGlConoceHechos(String glConoceHechos) {
		this.glConoceHechos = glConoceHechos;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
}
