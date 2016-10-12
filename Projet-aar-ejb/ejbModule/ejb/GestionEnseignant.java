package ejb;

import java.util.List;

import javax.ejb.Local;

import entities.Enseignant;

@Local
public interface GestionEnseignant {
	
	  public void ajouter(Enseignant enseignant);
	   public Enseignant rechercherEnseignant(long id);
	   public List<Enseignant> listerTousLesEnseignant();

}
