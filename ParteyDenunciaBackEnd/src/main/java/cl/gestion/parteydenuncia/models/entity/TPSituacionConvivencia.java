package cl.gestion.parteydenuncia.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="tpsituacionconvivencia")
public class TPSituacionConvivencia  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="cdtpsituacionconvivencia")
	private Long cdtpSituacionConvivencia;
	
	@Column(name ="gltpsituacionconvivencia", nullable = false)
	private String gltpSituacionConvivencia;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCdtpSituacionConvivencia() {
		return cdtpSituacionConvivencia;
	}

	public String getGltpSituacionConvivencia() {
		return gltpSituacionConvivencia;
	}

	public void setCdtpSituacionConvivencia(Long cdtpSituacionConvivencia) {
		this.cdtpSituacionConvivencia = cdtpSituacionConvivencia;
	}

	public void setGltpSituacionConvivencia(String gltpSituacionConvivencia) {
		this.gltpSituacionConvivencia = gltpSituacionConvivencia;
	}
	
}
