package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPEstadoPersona")
public class TPEstadoPersona  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPEstadoPersona")
	private int cdtpEstadoPersona;
	
	@Column(name ="GLTPEstadoPersona", nullable = false)
	private String gltpEstadoPersona;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpEstadoPersona() {
		return cdtpEstadoPersona;
	}

	public String getGltpEstadoPersona() {
		return gltpEstadoPersona;
	}

	public void setCdtpEstadoPersona(int cdtpEstadoPersona) {
		this.cdtpEstadoPersona = cdtpEstadoPersona;
	}

	public void setGltpEstadoPersona(String gltpEstadoPersona) {
		this.gltpEstadoPersona = gltpEstadoPersona;
	}

	
	
}
