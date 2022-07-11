package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPDocumento")
public class TPDocumento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPDocumento")
	private Integer cdtpDocumento;
	
	@Column(name ="GLTPDocumento")//, nullable = false
	private String gltpDocumento;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpDocumento() {
		return cdtpDocumento;
	}

	public String getGltpDocumento() {
		return gltpDocumento;
	}

	public void setCdtpDocumento(Integer cdtpDocumento) {
		this.cdtpDocumento = cdtpDocumento;
	}

	public void setGltpDocumento(String gltpDocumento) {
		this.gltpDocumento = gltpDocumento;
	}
	
	
}
