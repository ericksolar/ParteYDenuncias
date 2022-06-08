package cl.gestion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gestion.models.dao.IFuncionarioDao;
import cl.gestion.models.entity.Funcionario;

@Service
public class FuncionarioServicesImp implements IFuncionarioServices{
	
	@Autowired
	private IFuncionarioDao funcionarioDao;

	@Override
	public List<Funcionario> findAll() {
		return (List<Funcionario>)funcionarioDao.findAll();
	}

	@Override
	public Funcionario findById(Integer id) {
		return funcionarioDao.findById(id).orElse(null);
	}

	@Override
	public Funcionario save(Funcionario funcionario) {
		return funcionarioDao.save(funcionario);
	}

	@Override
	public void delete(Integer id) {
		funcionarioDao.deleteById(id);
	}

	@Override
	public Funcionario update(Funcionario funcionario) {
		funcionarioDao.deleteById(funcionario.getIdFuncionario());
		return funcionarioDao.save(funcionario);
	}


	


}
