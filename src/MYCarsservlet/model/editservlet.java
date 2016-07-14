package MYCarsservlet.model;

import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MYCars.MYCars;
import MYCars.MYCarsdb;

/**
 * Servlet implementation class editservlet
 */
@WebServlet("/editservlet")
public class editservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String Company = request.getParameter("Company");
		String CategoryID = request.getParameter("CategoryID");
		String Description = request.getParameter("Description");
		double Price = Double.parseDouble(request.getParameter("Price"));
		double Discount = Double.parseDouble(request.getParameter("Discount"));
		if(request.getParameter("choice").equals("add")){
			MYCarsdb objdb = new MYCarsdb();
			MYCars temp = new MYCars(Company, CategoryID, Description, (float)Price, (float)Discount);
			objdb.addCar(temp);
			out.println("Field Successfully added");	
			
		}
		else if(request.getParameter("choice").equals("delete")){
			
			String CategoryID1 = request.getParameter("CategoryID");
			MYCarsdb objdb1 = new MYCarsdb();
			MYCars temp1 = new MYCars(Company, CategoryID, Description, (float)Price, (float)Discount);
			objdb1.removeCar(temp1);
			out.println("Field Successfully removed");
		}
			
			
			
				
				
			}
			
		
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
