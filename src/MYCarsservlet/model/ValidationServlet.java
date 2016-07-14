package MYCarsservlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MYCars.Logindao;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter writer1 = response.getWriter();
		writer1.append(email + " " + password);
		

		Logindao logindao = new Logindao();
		RequestDispatcher dispatcher;

		if (logindao.isvaliduser(email, password) == true) {

			dispatcher = request.getRequestDispatcher("loginpage2.jsp");
			dispatcher.forward(request, response);
			
			// navigate to login page and error message

		} else

		{
			// navigate to login page and error message
			dispatcher = request.getRequestDispatcher("login.jsp");
			PrintWriter writer = response.getWriter();
			writer.append("Invalid credential!");
			dispatcher.include(request, response);

		}
	}}
	//}

