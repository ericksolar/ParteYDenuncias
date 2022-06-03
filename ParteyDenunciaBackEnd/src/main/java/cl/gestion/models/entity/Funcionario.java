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
@Table(name ="Funcionario")
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDFuncionario")
	private Integer idFuncionario;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "funcionario"})	
	@JoinColumn(name = "IDDenuncia", nullable = false) 
	private Denuncia denuncia;
	
	@Column(name ="IDPersona")
	private Integer idPersona;
	
	@Column(name ="LGResponsableDiligencia")
	private Boolean lgResponsableDiligencia;

	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLRolProcedimiento")
	private String glRolProcedimiento;
	
	@Column(name ="CDGrado")
	private Integer cdGrado;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPRolFuncionario", nullable = false)
	private TPRolFuncionario tpRolFuncionario;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

}
