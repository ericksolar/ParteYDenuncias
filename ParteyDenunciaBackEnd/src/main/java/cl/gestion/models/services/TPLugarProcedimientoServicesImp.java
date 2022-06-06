package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPLugarProcedimientoDao;
import cl.gestion.models.entity.TPLugarProcedimiento;

@Service
public class TPLugarProcedimientoServicesImp implements ITPLugarProcedimientoServices{
	
	@Autowired
	private ITPLugarProcedimientoDao tpLugarProcedimientoDao;
	
	@Override
	public List<TPLugarProcedimiento> findAll() {
		return (List<TPLugarProcedimiento>)tpLugarProcedimientoDao.findAll();
	}

	@Override
	public TPLugarProcedimiento findById(Integer id) {
		return tpLugarProcedimientoDao.findById(id).orElse(null);
	}

	@Override
	public TPLugarProcedimiento save(TPLugarProcedimiento tpLugarProcedimiento) {
		return tpLugarProcedimientoDao.save(tpLugarProcedimiento);
	}

	@Override
	public void delete(Integer id) {
		tpLugarProcedimientoDao.deleteById(id);
	}

	@Override
	public TPLugarProcedimiento update(TPLugarProcedimiento tpLugarProcedimiento) {
		tpLugarProcedimientoDao.deleteById(tpLugarProcedimiento.getCdtpLugarProcedimiento());
		return tpLugarProcedimientoDao.save(tpLugarProcedimiento);
	}

}
