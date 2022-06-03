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

@Getter
@Setter

@Entity
@Table(name ="ContactoRedSocial")
public class ContactoRedSocial implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDRedSocial")
	private Integer idRedSocial;

	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "contactoRedSocial"})	
	@JoinColumn(name = "IDPersonaParte", nullable = false) 
	private PersonaParte personaParte;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
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
	
}
