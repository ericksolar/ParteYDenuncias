package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPGradoEjecucion")
public class TPGradoEjecucion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPGradoEjecucion")
	private int cdtpGradoEjecucion;
	
	@Column(name ="GLTPDelito", nullable = false)
	private String gltpDelito;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpGradoEjecucion() {
		return cdtpGradoEjecucion;
	}

	public String getGltpDelito() {
		return gltpDelito;
	}

	public void setCdtpGradoEjecucion(int cdtpGradoEjecucion) {
		this.cdtpGradoEjecucion = cdtpGradoEjecucion;
	}

	public void setGltpDelito(String gltpDelito) {
		this.gltpDelito = gltpDelito;
	}

	
	
}
