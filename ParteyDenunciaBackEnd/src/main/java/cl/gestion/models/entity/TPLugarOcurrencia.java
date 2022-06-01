package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPLugarOcurrencia")
public class TPLugarOcurrencia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPLugarOcurrencia")
	private Integer cdtpLugarOcurrencia;
	
	@Column(name ="GLLugarOcurrencia", nullable = false)
	private String glLugarOcurrencia;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpLugarOcurrencia() {
		return cdtpLugarOcurrencia;
	}

	public String getGlLugarOcurrencia() {
		return glLugarOcurrencia;
	}

	public void setCdtpLugarOcurrencia(Integer cdtpLugarOcurrencia) {
		this.cdtpLugarOcurrencia = cdtpLugarOcurrencia;
	}

	public void setGlLugarOcurrencia(String glLugarOcurrencia) {
		this.glLugarOcurrencia = glLugarOcurrencia;
	}

	
}
