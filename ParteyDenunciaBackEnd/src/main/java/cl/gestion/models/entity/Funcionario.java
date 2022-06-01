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
@Table(name ="Funcionario")
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDFuncionario")
	private Integer idFuncionario;
	
	@Column(name ="IDDenuncia")
	private Integer idDenuncia;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public Integer getIdDenuncia() {
		return idDenuncia;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public Boolean getLgResponsableDiligencia() {
		return lgResponsableDiligencia;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlRolProcedimiento() {
		return glRolProcedimiento;
	}

	public Integer getCdGrado() {
		return cdGrado;
	}

	public TPRolFuncionario getTpRolFuncionario() {
		return tpRolFuncionario;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public void setLgResponsableDiligencia(Boolean lgResponsableDiligencia) {
		this.lgResponsableDiligencia = lgResponsableDiligencia;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlRolProcedimiento(String glRolProcedimiento) {
		this.glRolProcedimiento = glRolProcedimiento;
	}

	public void setCdGrado(Integer cdGrado) {
		this.cdGrado = cdGrado;
	}

	public void setTpRolFuncionario(TPRolFuncionario tpRolFuncionario) {
		this.tpRolFuncionario = tpRolFuncionario;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

}
