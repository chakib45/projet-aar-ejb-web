package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.AdminFacade;

/**
 * Servlet implementation class Controleur
 */
@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB 
	AdminFacade  admfacade;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String todo= request.getParameter("submitCustomer");
		String action=request.getParameter("todo");
		String courant =(String)request.getSession().getAttribute("courant");
		if((todo!=null)&& (todo.equals("valider"))){
			String login= request.getParameter("username");
			String pass= request.getParameter("password");
			if(admfacade.connexion(login, pass)){
				courant=login;
				request.getSession().setAttribute("courant", login);
				request.getRequestDispatcher("ajouteretudiant.jsp").forward(request, response);
				
			}else{
				request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
			}
			
			}
		
	}

}
