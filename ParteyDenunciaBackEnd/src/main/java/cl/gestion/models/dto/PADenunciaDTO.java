package cl.gestion.models.dto;

import java.io.Serializable;

public class PADenunciaDTO  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String cdReparticion;
	
	private String idInstitucionCargo;
	
	private String fcInicioDenuncia;
	
	private String fcTerminoDenuncia;
	
	private String nrRutUsuario;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCdReparticion() {
		return cdReparticion;
	}

	public String getIdInstitucionCargo() {
		return idInstitucionCargo;
	}

	public String getFcInicioDenuncia() {
		return fcInicioDenuncia;
	}

	public String getFcTerminoDenuncia() {
		return fcTerminoDenuncia;
	}

	public String getNrRutUsuario() {
		return nrRutUsuario;
	}

	public void setCdReparticion(String cdReparticion) {
		this.cdReparticion = cdReparticion;
	}

	public void setIdInstitucionCargo(String idInstitucionCargo) {
		this.idInstitucionCargo = idInstitucionCargo;
	}

	public void setFcInicioDenuncia(String fcInicioDenuncia) {
		this.fcInicioDenuncia = fcInicioDenuncia;
	}

	public void setFcTerminoDenuncia(String fcTerminoDenuncia) {
		this.fcTerminoDenuncia = fcTerminoDenuncia;
	}

	public void setNrRutUsuario(String nrRutUsuario) {
		this.nrRutUsuario = nrRutUsuario;
	}

	
}
