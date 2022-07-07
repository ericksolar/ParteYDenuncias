package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="TPCausaDetencion")
public class TPCausaDetencion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPCausaDetencion")
	private Integer cdtpCausaDetencion;
	
	@Column(name ="GLTPCausaDetencion", nullable = false)
	private String gltpCausaDetencion;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpCausaDetencion() {
		return cdtpCausaDetencion;
	}

	public String getGltpCausaDetencion() {
		return gltpCausaDetencion;
	}

	public void setCdtpCausaDetencion(Integer cdtpCausaDetencion) {
		this.cdtpCausaDetencion = cdtpCausaDetencion;
	}

	public void setGltpCausaDetencion(String gltpCausaDetencion) {
		this.gltpCausaDetencion = gltpCausaDetencion;
	}
	
}
