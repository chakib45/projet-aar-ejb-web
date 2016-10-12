package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class AdminFacadeImpl implements AdminFacade{
	@PersistenceContext 
  EntityManager em ;
  
	@Override
	public boolean connexion(String login, String password) {
		Query q= em.createQuery("FROM ADMIN a WHERE  a.login=?1 , a.password=?2");
		q.setParameter(1, login);
		q.setParameter(2, password);
		
		
		return (q.getResultList().size()>0);
		
		
		
	}

}
