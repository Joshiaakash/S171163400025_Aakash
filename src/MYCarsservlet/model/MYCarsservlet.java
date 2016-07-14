package MYCarsservlet.model;

//import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.niit.shoppingcartwebapplication.Logindao;

import MYCars.Accessories;
import MYCars.Accessoriesdb;
import MYCars.Logindao;
import MYCars.MYCars;
import MYCars.MYCarsdb;

/**
 * Servlet implementation class MYCarsservlet
 */
@WebServlet("/MYCarsservlet")
public class MYCarsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MYCarsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		
		
		PrintWriter pw= response.getWriter();
		String recvalue = request.getParameter("catid");
		
		if(recvalue.equals("1")){
			MYCarsdb objdb=new MYCarsdb();
			ArrayList<MYCars>getlist=objdb.getAll();
			for( int i=0; i<getlist.size();i++)
			pw.println("<html><body><center>");
			pw.println("<h1>Car Details</h1>");
			pw.println("<table border=1><thead><tr>");
			pw.println("<th colspan=5 rowspan=5>Company</th>");
			pw.println("<th colspan=5 rowspan=5>Category ID</th>");
			pw.println("<th colspan=5 rowspan=5>Type</th>");
			pw.println("<th colspan=5 rowspan=5>Price</th>");
			pw.println("<th colspan=5 rowspan=5>Discount in %");
			pw.println("</tr></thread>");
			
			for( int i=0; i<getlist.size();i++)
				{
					pw.println("<tbody><tr><td colspan=5 rowspan=5>" + getlist.get(i).getCompany()+"/td");
					pw.println("<td colspan=5 rowspan=5>" + getlist.get(i).getCategory_id()+"/td");
					pw.println("<td colspan=5 rowspan=5>" + getlist.get(i).getDesc1()+"/td");
					pw.println("<td colspan=5 rowspan=5>" + getlist.get(i).getPrice()+"/td");
					pw.println("<td colspan=5 rowspan=5>" + getlist.get(i).getDiscount()+"/td");
					pw.println("</tr><br>");
					
				}
			
		}
		else if(recvalue.equals("2")){
			Accessoriesdb objedb= new Accessoriesdb();
			ArrayList<Accessories>getlist1=objedb.getAll();
			
				pw.println("<html><body><center>");
				pw.println("<h1>Car Details</h1>");
				pw.println("<table border=1><thead><tr>");
				pw.println("<th colspan=5 rowspan=5>Company</th>");
				pw.println("<th colspan=5 rowspan=5>Category ID</th>");
				pw.println("<th colspan=5 rowspan=5>Type</th>");
				pw.println("<th colspan=5 rowspan=5>Price</th>");
				pw.println("<th colspan=5 rowspan=5>Discount in %");
				pw.println("</tr></thread>");
				
				for( int i=0; i< getlist1.size();i++)
					{
						pw.println("<tbody><tr><td colspan=5 rowspan=5>" + getlist1.get(i).getCompany()+"/td");
						pw.println("<td colspan=5 rowspan=5>" + getlist1.get(i).getCategory_id()+"/td");
						pw.println("<td colspan=5 rowspan=5>" + getlist1.get(i).getDesc()+"/td");
						pw.println("<td colspan=5 rowspan=5>" + getlist1.get(i).getPrice()+"/td");
						pw.println("<td colspan=5 rowspan=5>" + getlist1.get(i).getDiscount()+"/td");
						pw.println("</tr><br>");
						
					}
			}
			pw.println("</tbody></table><br><br>");
			pw.println("<a href=Index.jsp>Back to home</a>");
			pw.println("</center></body></html>");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		

		Logindao logindao = new Logindao();
		RequestDispatcher dispatcher;

		if (logindao.isvaliduser(userid, password) == true) {

			dispatcher = request.getRequestDispatcher("loginpage2.html");
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

	}

//}

	
	}



