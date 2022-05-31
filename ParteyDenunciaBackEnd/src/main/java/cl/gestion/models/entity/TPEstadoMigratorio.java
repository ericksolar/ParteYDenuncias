package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPEstadoMigratorio")
public class TPEstadoMigratorio  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPEstadoMigratorio")
	private int cdtpEstadoMigratorio;
	
	@Column(name ="GLTPEstadoMigratorio", nullable = false)
	private String gltpEstadoMigratorio;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpEstadoMigratorio() {
		return cdtpEstadoMigratorio;
	}

	public String getGltpEstadoMigratorio() {
		return gltpEstadoMigratorio;
	}

	public void setCdtpEstadoMigratorio(int cdtpEstadoMigratorio) {
		this.cdtpEstadoMigratorio = cdtpEstadoMigratorio;
	}

	public void setGltpEstadoMigratorio(String gltpEstadoMigratorio) {
		this.gltpEstadoMigratorio = gltpEstadoMigratorio;
	}

	
	
}
