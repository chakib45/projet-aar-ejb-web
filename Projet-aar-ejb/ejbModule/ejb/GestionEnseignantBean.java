package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Enseignant;

@Stateless
public class GestionEnseignantBean implements GestionEnseignant{

	
	@PersistenceContext
	 EntityManager em;
	
	@Override
	public void ajouter(Enseignant enseignant) {
		
		em.persist(enseignant);
	}

	@Override
	public Enseignant rechercherEnseignant(long id) {
		return em.find(Enseignant.class, id);
		
	}

	@Override
	public List<Enseignant> listerTousLesEnseignant() {
		
		  return em.createQuery("SELECT e FROM Enseignant e ORDER BY e.login").getResultList();
	}

}
