package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="TPRelacion")
public class TPRelacion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPRelacion")
	private Integer cdtpRelacion;
	
	@Column(name ="GLTPRelacion", nullable = false)
	private String gltpRelacion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpRelacion() {
		return cdtpRelacion;
	}

	public String getGltpRelacion() {
		return gltpRelacion;
	}

	public void setCdtpRelacion(Integer cdtpRelacion) {
		this.cdtpRelacion = cdtpRelacion;
	}

	public void setGltpRelacion(String gltpRelacion) {
		this.gltpRelacion = gltpRelacion;
	}

}
