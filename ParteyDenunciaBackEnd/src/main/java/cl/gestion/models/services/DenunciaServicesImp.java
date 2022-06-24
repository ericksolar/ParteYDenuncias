package cl.gestion.models.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDenunciaDao;
import cl.gestion.models.entity.Denuncia;

@Service
public class DenunciaServicesImp implements IDenunciaServices{
	
	@Autowired
	private IDenunciaDao denunciaDao;
	
	@Override
	public List<Denuncia> findAll() {
		return (List<Denuncia>)denunciaDao.findAll();
	}

	@Override
	public Denuncia findById(Integer id) {
		return denunciaDao.findById(id).orElse(null);
	}

	@Override
	public Denuncia save(Denuncia denuncia) {
		return denunciaDao.save(denuncia);
	}

	@Override
	public void delete(Integer id) {
		denunciaDao.deleteById(id);
	}

	@Override
	public Denuncia update(Denuncia denuncia) {
		denunciaDao.deleteById(denuncia.getCdReparticion());
		return denunciaDao.save(denuncia);
	}

	@Override
	public void PA_CrearDenunciaReparticionCorrelativo( String CDReparticion, String IDInstitucionCargo, String FCInicioDenuncia, String FCTerminoDenuncia, String NRRutUsuario) {
		denunciaDao.PA_CrearDenunciaReparticionCorrelativo(CDReparticion, IDInstitucionCargo, FCInicioDenuncia, FCTerminoDenuncia, NRRutUsuario);
	}




	
	

}
