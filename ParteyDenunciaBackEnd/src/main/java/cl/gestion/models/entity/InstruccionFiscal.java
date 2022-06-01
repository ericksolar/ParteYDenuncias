package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="InstruccionFiscal")
public class InstruccionFiscal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDInstruccionFiscal")
	private Integer idInstruccionFiscal;
	
	@Column(name ="IDDenuncia")
	private Integer idDenuncia;
	
	@Column(name ="IDPersonaParte")
	private Integer idPersonaParte;
	
	@Column(name ="IDFiscalia")
	private Integer idFiscalia;
	
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

	public Integer getIdDenuncia() {
		return idDenuncia;
	}

	public Integer getIdPersonaParte() {
		return idPersonaParte;
	}

	public Integer getIdFiscalia() {
		return idFiscalia;
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

	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public void setIdPersonaParte(Integer idPersonaParte) {
		this.idPersonaParte = idPersonaParte;
	}

	public void setIdFiscalia(Integer idFiscalia) {
		this.idFiscalia = idFiscalia;
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
	
}
