package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPCausaDetencion")
public class TPCausaDetencion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPCausaDetencion")
	private int cdtpCausaDetencion;
	
	@Column(name ="GLTPRelacion", nullable = false)
	private String gltpCausaDetencion;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpCausaDetencion() {
		return cdtpCausaDetencion;
	}

	public String getGltpCausaDetencion() {
		return gltpCausaDetencion;
	}

	public void setCdtpCausaDetencion(int cdtpCausaDetencion) {
		this.cdtpCausaDetencion = cdtpCausaDetencion;
	}

	public void setGltpCausaDetencion(String gltpCausaDetencion) {
		this.gltpCausaDetencion = gltpCausaDetencion;
	}
	
	
}
