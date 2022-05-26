package cl.gestion.parteydenuncia.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="tpzonadelito")
public class TPZonaDelito  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="cdtpzonadelito")
	private Long cdtpZonaDelito;
	
	@Column(name ="nmzonadelito", nullable = false)
	private String nmzonadelito;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCdtpZonaDelito() {
		return cdtpZonaDelito;
	}

	public String getNmzonadelito() {
		return nmzonadelito;
	}

	public void setCdtpZonaDelito(Long cdtpZonaDelito) {
		this.cdtpZonaDelito = cdtpZonaDelito;
	}

	public void setNmzonadelito(String nmzonadelito) {
		this.nmzonadelito = nmzonadelito;
	}
	
}
