package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPNNA")
public class TPNNA  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPNNA")
	private int cdtpNNA;
	
	@Column(name ="GLTPNNA", nullable = false)
	private String gltpNNA;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpNNA() {
		return cdtpNNA;
	}

	public String getGltpNNA() {
		return gltpNNA;
	}

	public void setCdtpNNA(int cdtpNNA) {
		this.cdtpNNA = cdtpNNA;
	}

	public void setGltpNNA(String gltpNNA) {
		this.gltpNNA = gltpNNA;
	}
	
	

}
