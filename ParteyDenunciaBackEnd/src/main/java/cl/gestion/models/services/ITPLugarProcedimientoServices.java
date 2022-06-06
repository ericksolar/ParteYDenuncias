package cl.gestion.models.services;

import java.util.List;

import cl.gestion.models.entity.TPLugarProcedimiento;

public interface ITPLugarProcedimientoServices {
	
	public List<TPLugarProcedimiento> findAll();
	
	public TPLugarProcedimiento findById(Integer id);
	
	public TPLugarProcedimiento save(TPLugarProcedimiento tpLugarProcedimiento);
	
	public void delete(Integer id);
	
	public TPLugarProcedimiento update(TPLugarProcedimiento tpLugarProcedimiento);
}
