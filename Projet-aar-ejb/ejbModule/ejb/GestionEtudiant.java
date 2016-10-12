package ejb;

import java.util.List;

import javax.ejb.Local;

import entities.Enseignant;
import entities.Etudiant;

@Local
public interface GestionEtudiant {
	
	public void ajouter(Etudiant etudiant);
	   public Etudiant rechercherEtudiant(long id);
	   public List<Etudiant> listerTousLesEtudiant();
	 

}
