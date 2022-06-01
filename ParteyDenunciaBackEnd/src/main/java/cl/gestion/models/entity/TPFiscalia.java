package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPFiscalia")
public class TPFiscalia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPFiscalia")
	private Integer cdtpFiscalia;
	
	@Column(name ="GLTPFiscalia", nullable = false)
	private String gltpFiscalia;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpFiscalia() {
		return cdtpFiscalia;
	}

	public String getGltpFiscalia() {
		return gltpFiscalia;
	}

	public void setCdtpFiscalia(Integer cdtpFiscalia) {
		this.cdtpFiscalia = cdtpFiscalia;
	}

	public void setGltpFiscalia(String gltpFiscalia) {
		this.gltpFiscalia = gltpFiscalia;
	}
	
}
