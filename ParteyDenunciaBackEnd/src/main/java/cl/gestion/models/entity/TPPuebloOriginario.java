package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPPuebloOriginario")
public class TPPuebloOriginario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPPuebloOriginario")
	private int cdtpPuebloOriginario;
	
	@Column(name ="GLTPPuebloOriginario", nullable = false)
	private String gltpPuebloOriginario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpPuebloOriginario() {
		return cdtpPuebloOriginario;
	}

	public String getGltpPuebloOriginario() {
		return gltpPuebloOriginario;
	}

	public void setCdtpPuebloOriginario(int cdtpPuebloOriginario) {
		this.cdtpPuebloOriginario = cdtpPuebloOriginario;
	}

	public void setGltpPuebloOriginario(String gltpPuebloOriginario) {
		this.gltpPuebloOriginario = gltpPuebloOriginario;
	}

}
