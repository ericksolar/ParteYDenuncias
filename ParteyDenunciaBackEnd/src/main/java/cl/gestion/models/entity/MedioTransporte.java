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
@Table(name ="MedioTransporte")
public class MedioTransporte implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDMedioTransporte")
	private Integer idMedioTransporte;

	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPUsoMedio", nullable = false)
	private TPUsoMedio tpUsoMedio;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPMedioTransporte", nullable = false)
	private TPMedioTransporte tpMedioTransporte;
	
	@Column(name ="IDMovil")
	private Integer idMovil;
	
	@Column(name ="LGEncargoRobo")
	private Boolean lgEncargoRobo;
	
	@Column(name ="LGIncautado")
	private Boolean lgIncautado;
	
	@Column(name ="LGPortaPatente")
	private Boolean lgPortaPatente;
	
	@Column(name ="GLNroEncargoRobo")
	private String glNroEncargoRobo;
	
	@Column(name ="GLPatente")
	private String glPatente;
	
	@Column(name ="GLMarca")
	private String glMarca;
	
	@Column(name ="GLModelo")
	private String glModelo;
	
	@Column(name ="GLColor")
	private String glColor;
	
	@Column(name ="GLPeaje")
	private String glPeaje;
	
	@Column(name ="GLAutopista")
	private String glAutopista;
	
	@Column(name ="GLObservacion")
	private String glObservacion;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;	
	
}
