package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.EventoMedioTransporte;

public interface IEventoMedioTransporteServices {
	
	public List<EventoMedioTransporte> findAll();
	
	public EventoMedioTransporte findById(Integer id);
	
	public EventoMedioTransporte save(EventoMedioTransporte eventoMedioTransporte);
	
	public void delete(Integer id);
	
	public EventoMedioTransporte update(EventoMedioTransporte eventoMedioTransporte);

}
