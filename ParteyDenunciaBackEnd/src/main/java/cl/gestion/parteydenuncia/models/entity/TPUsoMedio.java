package cl.gestion.parteydenuncia.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="tpusomedio")
public class TPUsoMedio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="cdtpusomedio")
	private Long cdtpUsoMedio;
	
	@Column(name ="gltpusomedio", nullable = false)
	private String gltpUsoMedio;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCdtpUsoMedio() {
		return cdtpUsoMedio;
	}

	public String getGltpUsoMedio() {
		return gltpUsoMedio;
	}

	public void setCdtpUsoMedio(Long cdtpUsoMedio) {
		this.cdtpUsoMedio = cdtpUsoMedio;
	}

	public void setGltpUsoMedio(String gltpUsoMedio) {
		this.gltpUsoMedio = gltpUsoMedio;
	}

	
	
}
