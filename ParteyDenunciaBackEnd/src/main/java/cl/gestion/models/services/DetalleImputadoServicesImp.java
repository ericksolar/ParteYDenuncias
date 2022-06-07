package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IDetalleImputadoDao;
import cl.gestion.models.entity.DetalleImputado;

@Service
public class DetalleImputadoServicesImp implements IDetalleImputadoServices{
	
	@Autowired
	private IDetalleImputadoDao detalleImputadoDao;
	
	@Override
	public List<DetalleImputado> findAll() {
		return (List<DetalleImputado>)detalleImputadoDao.findAll();
	}

	@Override
	public DetalleImputado findById(Integer id) {
		return detalleImputadoDao.findById(id).orElse(null);
	}

	@Override
	public DetalleImputado save(DetalleImputado detalleImputado) {
		return detalleImputadoDao.save(detalleImputado);
	}

	@Override
	public void delete(Integer id) {
		detalleImputadoDao.deleteById(id);
	}

	@Override
	public DetalleImputado update(DetalleImputado detalleImputado) {
		detalleImputadoDao.deleteById(detalleImputado.getIdDetalleImputado());
		return detalleImputadoDao.save(detalleImputado);
	}

}
