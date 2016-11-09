package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.List;


@Entity
public class Cerveja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
		
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataLote;
	
//	@OneToMany(mappedBy="cerveja", fetch=FetchType.LAZY)
//	private List<Malte> maltes;
	
	@Column
	private Double quantidade;
	
	
	

}
