package cl.gestion.parteydenuncia.models.services;
import java.util.List;
import cl.gestion.parteydenuncia.models.entity.TPSituacionDenuncia;

public interface ITPSituacionDenunciaServices {
	
	public List<TPSituacionDenuncia> findAll();
	
}
