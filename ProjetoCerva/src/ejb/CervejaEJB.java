package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Cerveja;

@Stateless
public class CervejaEJB {
	
	@PersistenceContext(unitName="jsfPU")
	private EntityManager em;
	
	
	public Cerveja save(Cerveja cerveja){
		em.persist(cerveja);
		return cerveja;
	}
		
}
