package ejb;

import javax.ejb.Local;

@Local
public interface AdminFacade {
	
	public boolean connexion (String login,String mdp);

}
