package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.GestionEtudiant;
import entities.Etudiant;

/**
 * Servlet implementation class ServletAjouterEtudiant
 */
@WebServlet(name="ajouteretudiant",urlPatterns={"*.ajouteretudiant"})
public class ServletAjouterEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
    private GestionEtudiant metieretudiant;   
    
    public ServletAjouterEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("compteetudiant", metieretudiant.listerTousLesEtudiant());
		request.getRequestDispatcher("ajouteretudiant.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action =request.getParameter("action");
		if(action.equals("Ajouter")){
			String login = request.getParameter("login");
			String pwd = request.getParameter("pwd");
			metieretudiant.ajouter(new Etudiant(login,pwd));
		}
	}

}
