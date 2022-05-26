package cl.gestion.parteydenuncia.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="tpresidencia")
public class TPRelacion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="cdtprelacion")
	private Long cdtpRelacion;
	
	@Column(name ="gltprelacion", nullable = false)
	private String gltpRelacion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCdtpRelacion() {
		return cdtpRelacion;
	}

	public String getGltpRelacion() {
		return gltpRelacion;
	}

	public void setCdtpRelacion(Long cdtpRelacion) {
		this.cdtpRelacion = cdtpRelacion;
	}

	public void setGltpRelacion(String gltpRelacion) {
		this.gltpRelacion = gltpRelacion;
	}
	
	

}
