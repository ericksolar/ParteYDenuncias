package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="TPResidencia")
public class TPResidencia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPResidencia")
	private int cdtpResidencia;
	
	@Column(name ="GLTPResidencia", nullable = false)
	private String gltpResidencia;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpResidencia() {
		return cdtpResidencia;
	}

	public String getGltpResidencia() {
		return gltpResidencia;
	}

	public void setCdtpResidencia(int cdtpResidencia) {
		this.cdtpResidencia = cdtpResidencia;
	}

	public void setGltpResidencia(String gltpResidencia) {
		this.gltpResidencia = gltpResidencia;
	}

}
