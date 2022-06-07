package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.DetalleImputado;

public interface IDetalleImputadoServices {
	
	public List<DetalleImputado> findAll();
	
	public DetalleImputado findById(Integer id);
	
	public DetalleImputado save(DetalleImputado detalleImputado);
	
	public void delete(Integer id);
	
	public DetalleImputado update(DetalleImputado detalleImputado);
	
}
