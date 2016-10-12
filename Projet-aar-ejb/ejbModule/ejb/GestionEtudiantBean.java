package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Enseignant;
import entities.Etudiant;

@Stateless
public class GestionEtudiantBean implements GestionEtudiant{

	
	@PersistenceContext
	 EntityManager em;
	
	@Override
	public void ajouter(Etudiant etudiant) {
		em.persist(etudiant);
		
	}

	@Override
	public Etudiant rechercherEtudiant(long id) {
		return em.find(Etudiant.class, id);
	}

	@Override
	public List<Etudiant> listerTousLesEtudiant() {
		 return em.createQuery("SELECT et FROM Etudiant et ORDER BY et.login").getResultList();
	}

	

	

}
