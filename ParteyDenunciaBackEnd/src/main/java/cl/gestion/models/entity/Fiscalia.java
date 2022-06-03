package cl.gestion.models.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name ="Fiscalia")
public class Fiscalia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDFiscalia")
	private Integer idFiscalia;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFiscaliaSup")
    private Fiscalia parent;

    @OneToMany(mappedBy = "parent")
    private Collection<Fiscalia> children;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL) 		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "CDTPFiscalia", nullable = false)
	private TPFiscalia tpFiscalia;
	
	@Column(name ="GLMarca")
	private String glMarca;
	
	@Column(name ="CDTPComuna")
	private Integer tpComuna;
	
	@Column(name ="FCIngreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcIngreso;
	
	@Column(name ="GLDireccion")
	private String glDireccion;
	
	@Column(name ="NRFono")
	private Integer nrFono;
	
	@Column(name ="FCExpiracion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcExpiracion;
}
