package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Fiscalia")
public class Fiscalia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDFiscalia")
	private Integer idFiscalia;
	
	//llamarse a si misma
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDFiscaliaSup")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "parent"})
    private Fiscalia parent;

//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "children"})
//    @OneToMany(mappedBy = "parent")
//    private Collection<Fiscalia> children;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPFiscalia", nullable = false)
	private TPFiscalia tpFiscalia;
	
	@Column(name ="NMFiscalia")
	private String nmFiscalia;
	
	@Column(name ="CDTPComuna")
	private Integer tpComuna;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLDireccion")
	private String glDireccion;
	
	@Column(name ="NRFono")
	private Integer nrFono;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdFiscalia() {
		return idFiscalia;
	}

	public Fiscalia getParent() {
		return parent;
	}

	public TPFiscalia getTpFiscalia() {
		return tpFiscalia;
	}

	public String getNmFiscalia() {
		return nmFiscalia;
	}

	public Integer getTpComuna() {
		return tpComuna;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public String getGlDireccion() {
		return glDireccion;
	}

	public Integer getNrFono() {
		return nrFono;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public void setIdFiscalia(Integer idFiscalia) {
		this.idFiscalia = idFiscalia;
	}

	public void setParent(Fiscalia parent) {
		this.parent = parent;
	}

	public void setTpFiscalia(TPFiscalia tpFiscalia) {
		this.tpFiscalia = tpFiscalia;
	}

	public void setNmFiscalia(String nmFiscalia) {
		this.nmFiscalia = nmFiscalia;
	}

	public void setTpComuna(Integer tpComuna) {
		this.tpComuna = tpComuna;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public void setGlDireccion(String glDireccion) {
		this.glDireccion = glDireccion;
	}

	public void setNrFono(Integer nrFono) {
		this.nrFono = nrFono;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}
	
	
	
}
