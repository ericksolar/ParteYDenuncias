package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPEstadoDenuncia")
public class TPEstadoDenuncia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPEstadoDenuncia")
	private Integer cdtpEstadoDenuncia;
	
	@Column(name ="GLTPEstadoDenuncia", nullable = false)
	private String gltpEstadoDenuncia;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpEstadoDenuncia() {
		return cdtpEstadoDenuncia;
	}

	public String getGltpEstadoDenuncia() {
		return gltpEstadoDenuncia;
	}

	public void setCdtpEstadoDenuncia(Integer cdtpEstadoDenuncia) {
		this.cdtpEstadoDenuncia = cdtpEstadoDenuncia;
	}

	public void setGltpEstadoDenuncia(String gltpEstadoDenuncia) {
		this.gltpEstadoDenuncia = gltpEstadoDenuncia;
	}
	
}
