package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPMedioTransporte")
public class TPMedioTransporte implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPMedioTransporte")
	private int cdtpMedioTransporte;
	
	@Column(name ="GLTPMedioTransporte", nullable = false)
	private String gltpMedioTransporte;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpMedioTransporte() {
		return cdtpMedioTransporte;
	}

	public String getGltpMedioTransporte() {
		return gltpMedioTransporte;
	}

	public void setCdtpMedioTransporte(int cdtpMedioTransporte) {
		this.cdtpMedioTransporte = cdtpMedioTransporte;
	}

	public void setGltpMedioTransporte(String gltpMedioTransporte) {
		this.gltpMedioTransporte = gltpMedioTransporte;
	}

	
	
}
