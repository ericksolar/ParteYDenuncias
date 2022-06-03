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
@Table(name ="DetalleImputado")
public class DetalleImputado  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDetalleImputado")
	private Integer idDetalleImputado;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "detalleImputado"})	
	@JoinColumn(name = "IDInvolucrado", nullable = false) 
	private Involucrado involucrado;
	
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

	
}
