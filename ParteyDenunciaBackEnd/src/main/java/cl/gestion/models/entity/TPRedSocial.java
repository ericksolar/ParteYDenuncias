package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="TPRedSocial")
public class TPRedSocial implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPRedSocial")
	private int cdtpRedSocial;
	
	@Column(name ="GLTPRedSocial", nullable = false)
	private String gltpRedSocial;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpRedSocial() {
		return cdtpRedSocial;
	}

	public String getGltpRedSocial() {
		return gltpRedSocial;
	}

	public void setCdtpRedSocial(int cdtpRedSocial) {
		this.cdtpRedSocial = cdtpRedSocial;
	}

	public void setGltpRedSocial(String gltpRedSocial) {
		this.gltpRedSocial = gltpRedSocial;
	}

}
