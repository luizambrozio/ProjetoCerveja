package producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//Escopo de aplicação do bean CDI
@ApplicationScoped
public class EntityManagerProducer {
	
    @PersistenceContext(name="jsfPU")
    private EntityManager em;

    // Factory de EntityManager
    @Produces
    // Escopo request CDI: a entity manager será poduzida a cada chamada 
    // a um método de persistência, 
    // sendo destruída depois
    @RequestScoped
    public EntityManager getEntityManager() {
        return em;
    }

}
