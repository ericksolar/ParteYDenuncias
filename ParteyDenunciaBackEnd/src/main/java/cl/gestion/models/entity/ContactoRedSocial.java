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
@Table(name ="ContactoRedSocial")
public class ContactoRedSocial implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDRedSocial")
	private Integer idRedSocial;

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "contactoRedSocial"})	
	@JoinColumn(name = "IDPersonaParte", nullable = false) 
	private PersonaParte personaParte;
	
	@ManyToOne(fetch = FetchType.LAZY) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPRedSocial", nullable = false)
	private TPRedSocial tpRedSocial;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLIdentificador")
	private String glIdentificador;
	
	@Column(name ="LGParticular")
	private Boolean lgParticular;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdRedSocial() {
		return idRedSocial;
	}

	public PersonaParte getPersonaParte() {
		return personaParte;
	}

	public TPRedSocial getTpRedSocial() {
		return tpRedSocial;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlIdentificador() {
		return glIdentificador;
	}

	public Boolean getLgParticular() {
		return lgParticular;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdRedSocial(Integer idRedSocial) {
		this.idRedSocial = idRedSocial;
	}

	public void setPersonaParte(PersonaParte personaParte) {
		this.personaParte = personaParte;
	}

	public void setTpRedSocial(TPRedSocial tpRedSocial) {
		this.tpRedSocial = tpRedSocial;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlIdentificador(String glIdentificador) {
		this.glIdentificador = glIdentificador;
	}

	public void setLgParticular(Boolean lgParticular) {
		this.lgParticular = lgParticular;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
}
