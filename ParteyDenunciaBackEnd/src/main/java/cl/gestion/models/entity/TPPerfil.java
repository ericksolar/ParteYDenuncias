package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPPerfil")
public class TPPerfil implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPPerfil")
	private int cdtpPerfil;
	
	@Column(name ="GLTPPerfil", nullable = false)
	private String gltpPerfil;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpPerfil() {
		return cdtpPerfil;
	}

	public String getGltpPerfil() {
		return gltpPerfil;
	}

	public void setCdtpPerfil(int cdtpPerfil) {
		this.cdtpPerfil = cdtpPerfil;
	}

	public void setGltpPerfil(String gltpPerfil) {
		this.gltpPerfil = gltpPerfil;
	}

}
