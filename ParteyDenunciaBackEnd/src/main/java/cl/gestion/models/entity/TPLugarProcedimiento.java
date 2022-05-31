package cl.gestion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TPLugarProcedimiento")
public class TPLugarProcedimiento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="CDTPLugarProcedimiento")
	private int cdtpLugarProcedimiento;
	
	@Column(name ="GLTPLugarProcedimiento", nullable = false)
	private String gltpLugarProcedimiento;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCdtpLugarProcedimiento() {
		return cdtpLugarProcedimiento;
	}

	public String getGltpLugarProcedimiento() {
		return gltpLugarProcedimiento;
	}

	public void setCdtpLugarProcedimiento(int cdtpLugarProcedimiento) {
		this.cdtpLugarProcedimiento = cdtpLugarProcedimiento;
	}

	public void setGltpLugarProcedimiento(String gltpLugarProcedimiento) {
		this.gltpLugarProcedimiento = gltpLugarProcedimiento;
	}

	
	
}
