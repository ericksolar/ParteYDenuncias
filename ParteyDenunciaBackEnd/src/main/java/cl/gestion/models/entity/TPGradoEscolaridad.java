package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPGradoEscolaridad")
public class TPGradoEscolaridad implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPGradoEscolaridad")
	private int cdtpGradoEscolaridad;
	
	@Column(name ="GLTPGradoEscolaridad", nullable = false)
	private String gltpGradoEscolaridad;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpGradoEscolaridad() {
		return cdtpGradoEscolaridad;
	}

	public String getGltpGradoEscolaridad() {
		return gltpGradoEscolaridad;
	}

	public void setCdtpGradoEscolaridad(int cdtpGradoEscolaridad) {
		this.cdtpGradoEscolaridad = cdtpGradoEscolaridad;
	}

	public void setGltpGradoEscolaridad(String gltpGradoEscolaridad) {
		this.gltpGradoEscolaridad = gltpGradoEscolaridad;
	}

}
