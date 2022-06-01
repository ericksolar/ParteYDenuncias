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
@Table(name ="EventoMedioTransporte")
public class EventoMedioTransporte  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDEventoMedioTransporte")
	private Integer idEventoMedioTransporte;
	
	@Column(name ="IDMedioTransporte")
	private Integer idMedioTransporte;

	@Column(name ="IDEvento")
	private Integer idEvento;
	
	@Column(name ="NRLatitudPosat")
	private Integer nrLatitudPosat;
	
	@Column(name ="IDEvento")
	private Integer NRLongitudPosatz;
	
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

	public Integer getIdMedioTransporte() {
		return idMedioTransporte;
	}

	public Integer getIdEvento() {
		return idEvento;
	}

	public Integer getNrLatitudPosat() {
		return nrLatitudPosat;
	}

	public Integer getNRLongitudPosatz() {
		return NRLongitudPosatz;
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

	public void setIdMedioTransporte(Integer idMedioTransporte) {
		this.idMedioTransporte = idMedioTransporte;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public void setNrLatitudPosat(Integer nrLatitudPosat) {
		this.nrLatitudPosat = nrLatitudPosat;
	}

	public void setNRLongitudPosatz(Integer nRLongitudPosatz) {
		NRLongitudPosatz = nRLongitudPosatz;
	}

	public void setFcExpiracion(Date fcExpiracion) {
		this.fcExpiracion = fcExpiracion;
	}

	public void setNrRutUsuario(Integer nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}
}
