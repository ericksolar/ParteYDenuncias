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
@Table(name ="InstruccionFiscal")
public class InstruccionFiscal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDInstruccionFiscal")
	private Integer idInstruccionFiscal;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "instruccionFiscal"})	
	@JoinColumn(name = "IDDenuncia", nullable = false) 
	private Denuncia denuncia;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "instruccionFiscal"})	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JoinColumn(name = "IDFiscalia", nullable = false) 
	private Fiscalia fiscalia;
	
	@Column(name ="IDPersonaFiscal")
	private Integer idPersonaFiscal;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdInstruccionFiscal() {
		return idInstruccionFiscal;
	}

	public Denuncia getDenuncia() {
		return denuncia;
	}


	public Integer getIdPersonaFiscal() {
		return idPersonaFiscal;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlInstruccionFiscal() {
		return glInstruccionFiscal;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdInstruccionFiscal(Integer idInstruccionFiscal) {
		this.idInstruccionFiscal = idInstruccionFiscal;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}



	public void setIdPersonaFiscal(Integer idPersonaFiscal) {
		this.idPersonaFiscal = idPersonaFiscal;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlInstruccionFiscal(String glInstruccionFiscal) {
		this.glInstruccionFiscal = glInstruccionFiscal;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public Fiscalia getFiscalia() {
		return fiscalia;
	}

	public void setFiscalia(Fiscalia fiscalia) {
		this.fiscalia = fiscalia;
	}
	
	

}
