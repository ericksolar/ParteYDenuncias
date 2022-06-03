package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name ="EventoMedioTransporte")
public class EventoMedioTransporte  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//estas ID siempre van porque el ID en las tablas tipo son el CDTP
	@Column(name ="IDEventoMedioTransporte")
	private Integer idEventoMedioTransporte;
	
	/**@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDMedioTransporte", referencedColumnName = "IDMedioTransporte")
    private MedioTransporte MedioTransporte;**/
	
	/**@OneToOne
	@JoinColumn(name = "IDMedioTransporte")
	private MedioTransporte medioTransporte;**/

	@Column(name ="IDEvento")
	private Integer idEvento;
	
	@Column(name ="NRLatitudPosat")
	private Integer nrLatitudPosat;
	
	@Column(name ="NRLongitudPosatz")
	private Integer nrLongitudPosatz;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
	
	@Column(name ="NRRutUsuario")
	private Integer nrRutUsuario;

}
