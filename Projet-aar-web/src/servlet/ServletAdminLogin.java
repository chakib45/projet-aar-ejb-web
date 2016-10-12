package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.AdminFacade;
import entities.Enseignant;

/**
 * Servlet implementation class ServletAdminLogin
 */
@WebServlet(name="adminlogin",urlPatterns={"*.adminlogin"})
public class ServletAdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
    private AdminFacade metieradmin;
    public ServletAdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		if(action.equals("valider")){
			String login = request.getParameter("username");
			String pwd = request.getParameter("password");
			metieradmin.connexion(login, pwd);
			request.getRequestDispatcher("ajouteretudiant.jsp").forward(request, response);
		}
	}

}
