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

@Entity
@Table(name ="DetalleDenuncia")
public class DetalleDenuncia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDDetalleDenuncia")
	private Integer idDetalleDenuncia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "detalleDenuncia"})	
	@JoinColumn(name = "IDDenuncia", nullable = false) 
	private Denuncia denuncia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "detalleDenuncia"})	
	@JoinColumn(name = "IDDireccion") 
	private Direccion direccion;

	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPZonaDelito", nullable = false)
	private TPZonaDelito tpZonaDelito;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPLugarOcurrencia", nullable = false)
	private TPLugarOcurrencia tpLugarOcurrencia;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPLugarProcedimiento", nullable = false)
	private TPLugarProcedimiento tpLugarProcedimiento;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPCausaDetencion", nullable = false)
	private TPCausaDetencion tpCausaDetencion;
	
	@Column(name ="NMLugar")
	private String nmLugar;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDetalleDenuncia() {
		return idDetalleDenuncia;
	}

	public Denuncia getDenuncia() {
		return denuncia;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public TPZonaDelito getTpZonaDelito() {
		return tpZonaDelito;
	}

	public TPLugarOcurrencia getTpLugarOcurrencia() {
		return tpLugarOcurrencia;
	}

	public TPLugarProcedimiento getTpLugarProcedimiento() {
		return tpLugarProcedimiento;
	}

	public TPCausaDetencion getTpCausaDetencion() {
		return tpCausaDetencion;
	}

	public String getNmLugar() {
		return nmLugar;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDetalleDenuncia(Integer idDetalleDenuncia) {
		this.idDetalleDenuncia = idDetalleDenuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setTpZonaDelito(TPZonaDelito tpZonaDelito) {
		this.tpZonaDelito = tpZonaDelito;
	}

	public void setTpLugarOcurrencia(TPLugarOcurrencia tpLugarOcurrencia) {
		this.tpLugarOcurrencia = tpLugarOcurrencia;
	}

	public void setTpLugarProcedimiento(TPLugarProcedimiento tpLugarProcedimiento) {
		this.tpLugarProcedimiento = tpLugarProcedimiento;
	}

	public void setTpCausaDetencion(TPCausaDetencion tpCausaDetencion) {
		this.tpCausaDetencion = tpCausaDetencion;
	}

	public void setNmLugar(String nmLugar) {
		this.nmLugar = nmLugar;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
	
	
}
