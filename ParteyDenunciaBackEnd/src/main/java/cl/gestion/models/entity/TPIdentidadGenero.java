package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPIdentidadGenero")
public class TPIdentidadGenero implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPIdentidadGenero")
	private Integer cdtpIdentidadGenero;
	
	@Column(name ="GLTPIdentidadGenero", nullable = false)
	private String gltpIdentidadGenero;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpIdentidadGenero() {
		return cdtpIdentidadGenero;
	}

	public String getGltpIdentidadGenero() {
		return gltpIdentidadGenero;
	}

	public void setCdtpIdentidadGenero(Integer cdtpIdentidadGenero) {
		this.cdtpIdentidadGenero = cdtpIdentidadGenero;
	}

	public void setGltpIdentidadGenero(String gltpIdentidadGenero) {
		this.gltpIdentidadGenero = gltpIdentidadGenero;
	}

	
}
