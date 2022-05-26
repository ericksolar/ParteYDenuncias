package cl.gestion.parteydenuncia.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="tprolimputado")
public class TPRolImputado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="cdtprolimputado")
	private Long cdtpRolImputado;
	
	@Column(name ="gltprolimputado", nullable = false)
	private String gltpRolImputado;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCdtpRolImputado() {
		return cdtpRolImputado;
	}

	public String getGltpRolImputado() {
		return gltpRolImputado;
	}

	public void setCdtpRolImputado(Long cdtpRolImputado) {
		this.cdtpRolImputado = cdtpRolImputado;
	}

	public void setGltpRolImputado(String gltpRolImputado) {
		this.gltpRolImputado = gltpRolImputado;
	}

	
	
}
