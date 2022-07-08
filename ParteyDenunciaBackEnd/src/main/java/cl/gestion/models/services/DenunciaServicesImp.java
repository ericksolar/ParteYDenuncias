package cl.gestion.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.converter.DenunciaConverter;
import cl.gestion.models.dao.IDenunciaDao;
import cl.gestion.models.dto.DenunciaDTO;
import cl.gestion.models.entity.Denuncia;

@Service
public class DenunciaServicesImp implements IDenunciaServices{
	
	@Autowired
	private IDenunciaDao denunciaDao;
	
	@Autowired(required=true)
	private DenunciaConverter denunciaConverter;
	
	@Override
	public List<Denuncia> findAll() {
		return (List<Denuncia>)denunciaDao.findAll();
	}

	@Override
	public Denuncia findById(Integer id) {
		return denunciaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Denuncia save(DenunciaDTO denunciaDTO) {
		
		Denuncia denuncia = new Denuncia();
		denuncia = denunciaConverter.ConvertDTOtoEntitytoPersist(denunciaDTO);
		denuncia = denunciaDao.save(denuncia);
		
		return denunciaDao.findById(denuncia.getIdDenuncia()).orElse(null);
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
