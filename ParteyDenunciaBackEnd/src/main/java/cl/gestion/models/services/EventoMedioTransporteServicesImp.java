package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IEventoMedioTransporteDao;
import cl.gestion.models.entity.EventoMedioTransporte;

@Service
public class EventoMedioTransporteServicesImp implements IEventoMedioTransporteServices{

	@Autowired
	private IEventoMedioTransporteDao eventoMedioTransporteDao;
	
	@Override
	public List<EventoMedioTransporte> findAll() {
		return (List<EventoMedioTransporte>)eventoMedioTransporteDao.findAll();
	}

	@Override
	public EventoMedioTransporte findById(Integer id) {
		return eventoMedioTransporteDao.findById(id).orElse(null);
	}

	@Override
	public EventoMedioTransporte save(EventoMedioTransporte eventoMedioTransporte) {
		return eventoMedioTransporteDao.save(eventoMedioTransporte);
	}

	@Override
	public void delete(Integer id) {
		eventoMedioTransporteDao.deleteById(id);
	}

	@Override
	public EventoMedioTransporte update(EventoMedioTransporte eventoMedioTransporte) {
		eventoMedioTransporteDao.deleteById(eventoMedioTransporte.getIdEvento());
		return eventoMedioTransporteDao.save(eventoMedioTransporte);
	}

}
