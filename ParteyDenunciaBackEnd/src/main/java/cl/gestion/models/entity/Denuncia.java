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
@Table(name ="Denuncia")
public class Denuncia  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDenuncia")
	private Integer idDenuncia;
	
	@Column(name ="IDInstitucionCargo")
	private Integer idInstitucionCargo;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="CDReparticion")
	private Integer cdReparticion;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPDocumento", nullable = false)
	private TPDocumento tpDocumento;
	
	@Column(name ="NRDocumento")
	private Integer nrDocumento;
	
	@Column(name ="FCInicioDenuncia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicioDenuncia;
	
	@Column(name ="FCTerminoDenuncia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcTerminoDenuncia;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDenuncia() {
		return idDenuncia;
	}

	public Integer getIdInstitucionCargo() {
		return idInstitucionCargo;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public Integer getCdReparticion() {
		return cdReparticion;
	}

	public TPDocumento getTpDocumento() {
		return tpDocumento;
	}

	public Integer getNrDocumento() {
		return nrDocumento;
	}

	public Date getFcInicioDenuncia() {
		return fcInicioDenuncia;
	}

	public Date getFcTerminoDenuncia() {
		return fcTerminoDenuncia;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDenuncia(Integer idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public void setIdInstitucionCargo(Integer idInstitucionCargo) {
		this.idInstitucionCargo = idInstitucionCargo;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setCdReparticion(Integer cdReparticion) {
		this.cdReparticion = cdReparticion;
	}

	public void setTpDocumento(TPDocumento tpDocumento) {
		this.tpDocumento = tpDocumento;
	}

	public void setNrDocumento(Integer nrDocumento) {
		this.nrDocumento = nrDocumento;
	}

	public void setFcInicioDenuncia(Date fcInicioDenuncia) {
		this.fcInicioDenuncia = fcInicioDenuncia;
	}

	public void setFcTerminoDenuncia(Date fcTerminoDenuncia) {
		this.fcTerminoDenuncia = fcTerminoDenuncia;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
}
