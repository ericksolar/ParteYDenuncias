package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="TPRolFuncionario")
public class TPRolFuncionario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPRolFuncionario")
	private Integer cdtpRolFuncionario;
	
	@Column(name ="GLTPRolFuncionario", nullable = false)
	private String gltpRolFuncionario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCdtpRolFuncionario() {
		return cdtpRolFuncionario;
	}

	public String getGltpRolFuncionario() {
		return gltpRolFuncionario;
	}

	public void setCdtpRolFuncionario(Integer cdtpRolFuncionario) {
		this.cdtpRolFuncionario = cdtpRolFuncionario;
	}

	public void setGltpRolFuncionario(String gltpRolFuncionario) {
		this.gltpRolFuncionario = gltpRolFuncionario;
	}

	

}
