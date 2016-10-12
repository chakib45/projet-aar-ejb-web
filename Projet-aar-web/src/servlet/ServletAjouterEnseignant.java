package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.GestionEnseignant;
import ejb.GestionEtudiant;
import entities.Enseignant;
import entities.Etudiant;

/**
 * Servlet implementation class ServletAjouterEnseignant
 */
@WebServlet(name="ajouterenseignant",urlPatterns={"*.ajouterenseignant"})
public class ServletAjouterEnseignant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	@EJB
    private GestionEnseignant metierenseignant;  
	
    public ServletAjouterEnseignant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("compteenseignant", metierenseignant.listerTousLesEnseignant());
		request.getRequestDispatcher("ajouterenseignant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		if(action.equals("Ajouter")){
			String login = request.getParameter("login");
			String pwd = request.getParameter("pwd");
			metierenseignant.ajouter(new Enseignant(login,pwd));
		}
	}

}
