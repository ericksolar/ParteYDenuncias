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
@Table(name ="CausaDetencion")
public class CausaDetencion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDCausaDetencion")
	private Integer idCausaDetencion;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "causaDetencion"})	
	@JoinColumn(name = "IDDetencion", nullable = false) 
	private Detencion detencion;

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPCausaDetencion", nullable = false)
	private TPCausaDetencion tpCausaDetencion;
	
	@Column(name ="GLDetalle")
	private String glDetalle;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

}
