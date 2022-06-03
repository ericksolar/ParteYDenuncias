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
@Table(name ="Direccion")
public class Direccion  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDireccion")
	private Integer idDireccion;
	
	@Column(name ="CDComuna")
	private Integer cdComuna;       
	
	@Column(name ="GLSector")
	private String glSector;
	
	@Column(name ="GLBlock")
	private String glBlock;
	
	@Column(name ="NMCalle")
	private String nmCalle;
	
	@Column(name ="NMVillaPoblacion")
	private String nmVillaPoblacion;
	
	@Column(name ="GLNumero")
	private String glNumero;
	
	@Column(name ="GLReferencia")
	private String glReferencia;
	
	@Column(name ="GLDepartamento")
	private String glDepartamento;
	
	@Column(name ="NRLatitud")
	private float  nrLatitud;
	
	@Column(name ="NRlongitud")
	private float  nrlongitud;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPContactoDenuncia", nullable = false)
	private TPContactoDenuncia tpContactoDenuncia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPResidencia", nullable = false)
	private TPResidencia tpResidencia;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="NMResidenciaInstitucional")
	private String nmResidenciaInstitucional;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

}
