package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPContactoDenuncia")
public class TPContactoDenuncia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPContactoDenuncia")
	private int cdtpContactoDenuncia;
	
	@Column(name ="GLTPContactoDenuncia", nullable = false)
	private String gltpContactoDenuncia;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpContactoDenuncia() {
		return cdtpContactoDenuncia;
	}

	public String getGltpContactoDenuncia() {
		return gltpContactoDenuncia;
	}

	public void setCdtpContactoDenuncia(int cdtpContactoDenuncia) {
		this.cdtpContactoDenuncia = cdtpContactoDenuncia;
	}

	public void setGltpContactoDenuncia(String gltpContactoDenuncia) {
		this.gltpContactoDenuncia = gltpContactoDenuncia;
	}

	
	
}
