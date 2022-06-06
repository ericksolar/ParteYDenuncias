package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.ITPRolFuncionarioDao;
import cl.gestion.models.entity.TPRolFuncionario;

@Service
public class TPRolFuncionarioServicesImp implements ITPRolFuncionarioServices{

	@Autowired
	private ITPRolFuncionarioDao tpRolFuncionarioDao;
	
	@Override
	public List<TPRolFuncionario> findAll() {
		return (List<TPRolFuncionario>)tpRolFuncionarioDao.findAll();
	}

	@Override
	public TPRolFuncionario findById(Integer id) {
		return tpRolFuncionarioDao.findById(id).orElse(null);
	}

	@Override
	public TPRolFuncionario save(TPRolFuncionario tpRolFuncionario) {
		return tpRolFuncionarioDao.save(tpRolFuncionario);
	}

	@Override
	public void delete(Integer id) {
		tpRolFuncionarioDao.deleteById(id);
	}

	@Override
	public TPRolFuncionario update(TPRolFuncionario tpRolFuncionario) {
		tpRolFuncionarioDao.deleteById(tpRolFuncionario.getCdtpRolFuncionario());
		return tpRolFuncionarioDao.save(tpRolFuncionario);
	}

}
