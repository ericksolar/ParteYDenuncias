package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPMedioNotificacion")
public class TPMedioNotificacion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPMedioNotificacion")
	private int cdtpMedioNotificacion;
	
	@Column(name ="GLTPMedioNotificacion", nullable = false)
	private String gltpMedioNotificacion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpMedioNotificacion() {
		return cdtpMedioNotificacion;
	}

	public String getGltpMedioNotificacion() {
		return gltpMedioNotificacion;
	}

	public void setCdtpMedioNotificacion(int cdtpMedioNotificacion) {
		this.cdtpMedioNotificacion = cdtpMedioNotificacion;
	}

	public void setGltpMedioNotificacion(String gltpMedioNotificacion) {
		this.gltpMedioNotificacion = gltpMedioNotificacion;
	}
	

}
