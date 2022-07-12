package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

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
	
	@ManyToOne(fetch = FetchType.LAZY) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPContactoDenuncia", nullable = false)
	private TPContactoDenuncia tpContactoDenuncia;
	
	@ManyToOne(fetch = FetchType.LAZY) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPResidencia", nullable = false)
	private TPResidencia tpResidencia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "direccion", cascade=CascadeType.ALL)
	@JsonIgnoreProperties(value={"hibernateLazyInitializer", "handler", "direccion"}, allowSetters=true)
	private List<PersonaParte> personaParte;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public Integer getCdComuna() {
		return cdComuna;
	}

	public String getGlSector() {
		return glSector;
	}

	public String getGlBlock() {
		return glBlock;
	}

	public String getNmCalle() {
		return nmCalle;
	}

	public String getNmVillaPoblacion() {
		return nmVillaPoblacion;
	}

	public String getGlNumero() {
		return glNumero;
	}

	public String getGlReferencia() {
		return glReferencia;
	}

	public String getGlDepartamento() {
		return glDepartamento;
	}

	public float getNrLatitud() {
		return nrLatitud;
	}

	public float getNrlongitud() {
		return nrlongitud;
	}

	public TPContactoDenuncia getTpContactoDenuncia() {
		return tpContactoDenuncia;
	}

	public TPResidencia getTpResidencia() {
		return tpResidencia;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getNmResidenciaInstitucional() {
		return nmResidenciaInstitucional;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public void setCdComuna(Integer cdComuna) {
		this.cdComuna = cdComuna;
	}

	public void setGlSector(String glSector) {
		this.glSector = glSector;
	}

	public void setGlBlock(String glBlock) {
		this.glBlock = glBlock;
	}

	public void setNmCalle(String nmCalle) {
		this.nmCalle = nmCalle;
	}

	public void setNmVillaPoblacion(String nmVillaPoblacion) {
		this.nmVillaPoblacion = nmVillaPoblacion;
	}

	public void setGlNumero(String glNumero) {
		this.glNumero = glNumero;
	}

	public void setGlReferencia(String glReferencia) {
		this.glReferencia = glReferencia;
	}

	public void setGlDepartamento(String glDepartamento) {
		this.glDepartamento = glDepartamento;
	}

	public void setNrLatitud(float nrLatitud) {
		this.nrLatitud = nrLatitud;
	}

	public void setNrlongitud(float nrlongitud) {
		this.nrlongitud = nrlongitud;
	}

	public void setTpContactoDenuncia(TPContactoDenuncia tpContactoDenuncia) {
		this.tpContactoDenuncia = tpContactoDenuncia;
	}

	public void setTpResidencia(TPResidencia tpResidencia) {
		this.tpResidencia = tpResidencia;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setNmResidenciaInstitucional(String nmResidenciaInstitucional) {
		this.nmResidenciaInstitucional = nmResidenciaInstitucional;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public List<PersonaParte> getPersonaParte() {
		return personaParte;
	}

	public void setPersonaParte(List<PersonaParte> personaParte) {
		this.personaParte = personaParte;
	}
	
}
