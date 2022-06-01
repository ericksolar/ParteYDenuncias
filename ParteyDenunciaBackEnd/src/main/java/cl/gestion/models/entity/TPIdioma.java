package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPIdioma")
public class TPIdioma  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPIdioma")
	private Integer cdtpIdioma;
	
	@Column(name ="GLTPIdioma", nullable = false)
	private String gltpIdioma;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpIdioma() {
		return cdtpIdioma;
	}

	public String getGltpIdioma() {
		return gltpIdioma;
	}

	public void setCdtpIdioma(Integer cdtpIdioma) {
		this.cdtpIdioma = cdtpIdioma;
	}

	public void setGltpIdioma(String gltpIdioma) {
		this.gltpIdioma = gltpIdioma;
	}
	
	
	
}
