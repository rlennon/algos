

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import database connector class
import jdbc.DBConnector;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//object to hold query result
	private ResultSet result;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		//strings to hold DB values
		String dbUname = "";
		String dbPassword = "";

		//create query
		String query = makeSearchQuery(uname);

		try {

			//create connection with DB
			DBConnector.createConnection();

			//get statement object
			//execute query using that object
			//(passing in SQL query)
			//and assigned to a result set object
			result = DBConnector.getStatement().executeQuery(query);

			//the result set object will have 2 elements
			//i.e. the 2 columns queried in the DB
			result.next();

			//take username and password from columns
			//i.e. 1 = username, 2 = password
			dbUname = result.getString(1);
			dbPassword = result.getString(2);


		} 

		//if error
		catch (LinkageError | Exception e) {

			//print stack
			e.printStackTrace();
		}

		//always execute
		finally {
			try {

				//close connection
				DBConnector.closeConnection();
			} 
			catch (SQLException e) {
				//print error message and stack
				System.out.print("SQL error -- " + e.getMessage());
				e.printStackTrace();
			}
		}


		//if name entered equals name in DB
		//AND
		//if password entered equals password in DB
		if(uname.equals(dbUname) && password.equals(dbPassword))
		{
			//open members page
			response.sendRedirect("member.jsp");
		}
		
		//else invalid username and/or password
		else
		{
			//display error page
			response.sendRedirect("error.jsp");
		}
	}
	
	
	//method to write sql query
	private String makeSearchQuery(String uname) {

		return "SELECT username, password FROM clients WHERE username='" + uname + "';";
	}

}
