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
@Table(name ="Involucrado")
public class Involucrado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDInvolucrado")
	private Integer idInvolucrado;
	
	@Column(name ="IDDenuncia")
	private Integer idDenuncia;
	
	@Column(name ="IDPersonaParte")
	private Integer idPersonaParte;
	
	@Column(name ="IDDireccion")
	private Integer idDireccion;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPContactoDenuncia", nullable = false)
	private TPContactoDenuncia TPContactoDenuncia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPSituacionConvivencia", nullable = false)
	private TPSituacionConvivencia TPSituacionConvivencia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPInvolucrado", nullable = false)
	private TPInvolucrado tpInvolucrado;
	
	@Column(name ="GLDetalleLesiones")
	private String glDetalleLesiones;
	
	@Column(name ="GLOtrosTestigos")
	private String glOtrosTestigos;
	
	@Column(name ="GLPruebaHechos")
	private String glPruebaHechos;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdInvolucrado() {
		return idInvolucrado;
	}

	public Integer getIdDenuncia() {
		return idDenuncia;
	}

	public Integer getIdPersonaParte() {
		return idPersonaParte;
	}

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public TPContactoDenuncia getTPContactoDenuncia() {
		return TPContactoDenuncia;
	}

	public TPSituacionConvivencia getTPSituacionConvivencia() {
		return TPSituacionConvivencia;
	}

	public TPInvolucrado getTpInvolucrado() {
		return tpInvolucrado;
	}

	public String getGlDetalleLesiones() {
		return glDetalleLesiones;
	}

	public String getGlOtrosTestigos() {
		return glOtrosTestigos;
	}

	public String getGlPruebaHechos() {
		return glPruebaHechos;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdInvolucrado(Integer idInvolucrado) {
		this.idInvolucrado = idInvolucrado;
	}

	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public void setIdPersonaParte(Integer idPersonaParte) {
		this.idPersonaParte = idPersonaParte;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setTPContactoDenuncia(TPContactoDenuncia tPContactoDenuncia) {
		TPContactoDenuncia = tPContactoDenuncia;
	}

	public void setTPSituacionConvivencia(TPSituacionConvivencia tPSituacionConvivencia) {
		TPSituacionConvivencia = tPSituacionConvivencia;
	}

	public void setTpInvolucrado(TPInvolucrado tpInvolucrado) {
		this.tpInvolucrado = tpInvolucrado;
	}

	public void setGlDetalleLesiones(String glDetalleLesiones) {
		this.glDetalleLesiones = glDetalleLesiones;
	}

	public void setGlOtrosTestigos(String glOtrosTestigos) {
		this.glOtrosTestigos = glOtrosTestigos;
	}

	public void setGlPruebaHechos(String glPruebaHechos) {
		this.glPruebaHechos = glPruebaHechos;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
	
	
}
