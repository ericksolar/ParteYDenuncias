package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name ="InstruccionFiscal")
public class InstruccionFiscal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDInstruccionFiscal")
	private Integer idInstruccionFiscal;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "funcionario"})	
	@JoinColumn(name = "IDDenuncia", nullable = false) 
	private Denuncia denuncia;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "funcionario"})	
	@JoinColumn(name = "IDFiscalia", nullable = false) 
	private Fiscalia fiscalia;
	
	@Column(name ="IDPersonaParte")
	private Integer idPersonaParte;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLInstruccionFiscal")
	private String glInstruccionFiscal;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

}
