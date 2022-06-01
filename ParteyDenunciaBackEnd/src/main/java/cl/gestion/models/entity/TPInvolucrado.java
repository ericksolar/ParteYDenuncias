package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPInvolucrado")
public class TPInvolucrado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPInvolucrado")
	private Integer cdtpInvolucrado;
	
	@Column(name ="GLTPInvolucrado", nullable = false)
	private String gltpInvolucrado;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpInvolucrado() {
		return cdtpInvolucrado;
	}

	public String getGltpInvolucrado() {
		return gltpInvolucrado;
	}

	public void setCdtpInvolucrado(Integer cdtpInvolucrado) {
		this.cdtpInvolucrado = cdtpInvolucrado;
	}

	public void setGltpInvolucrado(String gltpInvolucrado) {
		this.gltpInvolucrado = gltpInvolucrado;
	}

	
	
}
