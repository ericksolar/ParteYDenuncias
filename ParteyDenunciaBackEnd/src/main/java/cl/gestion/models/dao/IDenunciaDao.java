package cl.gestion.models.dao;


import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cl.gestion.models.entity.Denuncia;

public interface IDenunciaDao extends CrudRepository<Denuncia,Integer>{
	
	//@Procedure("Esolar.PA_CrearDenunciaReparticionCorrelativo( Integer CDReparticion, Integer IDInstitucionCargo, Date FCInicioDenuncia, Date FCTerminoDenuncia, Integer NRRutUsuario)")
    @Query(value = " { call [Esolar].[PA_CrearDenunciaReparticionCorrelativo](:CDReparticion , :IDInstitucionCargo, :FCInicioDenuncia,:FCTerminoDenuncia, :NRRutUsuario) }", nativeQuery = true)
	void PA_CrearDenunciaReparticionCorrelativo(@Param("CDReparticion") String CDReparticion,
												@Param("IDInstitucionCargo") String IDInstitucionCargo,
												@Param("FCInicioDenuncia") String FCInicioDenuncia,
												@Param("FCTerminoDenuncia") String FCTerminoDenuncia,
												@Param("NRRutUsuario") String NRRutUsuario
	); 
	

}
