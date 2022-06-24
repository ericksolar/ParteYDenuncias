package cl.gestion.models.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cl.gestion.models.entity.Involucrado;

public interface IInvolucradoDao extends CrudRepository<Involucrado,Integer>{

	/*@Query(value = "EXEC Esolar.PA_CrearPersona(:CDTPPersona, :NRRutUsuario , :CDTPDocIdentidad ,:GLNRDocIdentidad , :NMPrimerNom);", nativeQuery = true)
	
	public static void postCrearPersona(@Param("CDTPPersona") Integer CDTPPersona, @Param("NRRutUsuario") Integer NRRutUsuario, @Param("CDTPDocIdentidad") Integer CDTPDocIdentidad,
										@Param("GLNRDocIdentidad") String GLNRDocIdentidad, @Param("NMPrimerNom") String NMPrimerNom){
		
		System.out.println("Dao");

	}*/
	
}
