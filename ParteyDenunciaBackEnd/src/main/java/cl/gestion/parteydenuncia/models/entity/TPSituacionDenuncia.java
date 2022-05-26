package cl.gestion.parteydenuncia.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="tpsituaciondenuncia")
public class TPSituacionDenuncia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="cdtpsituacion")
	private Long cdtpSituacion;
	
	@Column(name ="gltpsituacion", nullable = false)
	private String gltpSituacion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCdtpSituacion() {
		return cdtpSituacion;
	}

	public String getGltpSituacion() {
		return gltpSituacion;
	}

	public void setCdtpSituacion(Long cdtpSituacion) {
		this.cdtpSituacion = cdtpSituacion;
	}

	public void setGltpSituacion(String gltpSituacion) {
		this.gltpSituacion = gltpSituacion;
	}
	
	

}
