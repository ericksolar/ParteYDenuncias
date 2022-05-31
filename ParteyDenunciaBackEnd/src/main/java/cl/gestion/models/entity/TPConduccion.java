package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="TPConduccion")
public class TPConduccion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPConduccion")
	private int cdtpConduccion;
	
	@Column(name ="GLTPConduccion", nullable = false)
	private String gltpConduccion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpConduccion() {
		return cdtpConduccion;
	}

	public String getGltpConduccion() {
		return gltpConduccion;
	}

	public void setCdtpConduccion(int cdtpConduccion) {
		this.cdtpConduccion = cdtpConduccion;
	}

	public void setGltpConduccion(String gltpConduccion) {
		this.gltpConduccion = gltpConduccion;
	}
	
	

}
