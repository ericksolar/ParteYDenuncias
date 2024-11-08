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
@Table(name ="EventoMedioTransporte")
public class EventoMedioTransporte  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDEventoMedioTransporte")
	private Integer idEventoMedioTransporte;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 
	@JsonIgnoreProperties(value={"hibernateLazyInitializer", "handler", "eventoMedioTransporte"})
    @JoinColumn(name = "IDMedioTransporte")
    private MedioTransporte medioTransporte;
	
	@Column(name ="IDEvento")
	private Integer idEvento;
	
	@Column(name ="NRLatitudPosat")
	private Float nrLatitudPosat;
	
	@Column(name ="NRLongitudPosat")
	private Float nrLongitudPosat;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdEventoMedioTransporte() {
		return idEventoMedioTransporte;
	}

	public Integer getIdEvento() {
		return idEvento;
	}

	public Float getNrLatitudPosat() {
		return nrLatitudPosat;
	}

	public Float getNrLongitudPosat() {
		return nrLongitudPosat;
	}

	public Date getFcExpiracion() {
		return fcExpiracion;
	}

	public Integer getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setIdEventoMedioTransporte(Integer idEventoMedioTransporte) {
		this.idEventoMedioTransporte = idEventoMedioTransporte;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public void setNrLatitudPosat(Float nrLatitudPosat) {
		this.nrLatitudPosat = nrLatitudPosat;
	}

	public void setNrLongitudPosat(Float nrLongitudPosat) {
		this.nrLongitudPosat = nrLongitudPosat;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	public MedioTransporte getMedioTransporte() {
		return medioTransporte;
	}

	public void setMedioTransporte(MedioTransporte medioTransporte) {
		this.medioTransporte = medioTransporte;
	}
	
}
