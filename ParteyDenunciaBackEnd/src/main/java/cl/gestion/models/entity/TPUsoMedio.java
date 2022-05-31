package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="TPUsoMedio")
public class TPUsoMedio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPUsoMedio")
	private int cdtpUsoMedio;
	
	@Column(name ="GLTPUsoMedio", nullable = false)
	private String gltpUsoMedio;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpUsoMedio() {
		return cdtpUsoMedio;
	}

	public String getGltpUsoMedio() {
		return gltpUsoMedio;
	}

	public void setCdtpUsoMedio(int cdtpUsoMedio) {
		this.cdtpUsoMedio = cdtpUsoMedio;
	}

	public void setGltpUsoMedio(String gltpUsoMedio) {
		this.gltpUsoMedio = gltpUsoMedio;
	}
	
	
}
