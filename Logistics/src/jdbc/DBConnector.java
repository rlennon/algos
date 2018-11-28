//class to connect to database
//


package jdbc;

//import statements
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

public class DBConnector {

	//instance fields
	//
	//driver name
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	//socket (IP address + port)
	private static final String ADDRESS = "35.234.140.25:3306";
	//database name
	private static final String NAME = "/algos";
	//suppress error
	private static final String ERROR = "?autoReconnect=true&useSSL=false";
	//connection string
	private static final String URL = "jdbc:mysql://" + ADDRESS + NAME + ERROR;
	//
	//DB user name
	private static final String USERNAME = "remote";
	//DB password
	private static final String PASSWORD = "mypassword";
	//
	//object to establish connection with database server
	private static Connection connection;
	//object to execute queries
	private static Statement statement;



	//methods
	//
	//create connection method
	//throw exceptions
	public static void createConnection() throws LinkageError, ClassNotFoundException, SQLException, Exception{

		//register JDBC
		Class.forName(DRIVER);

		//if registered 
		//i.e. it didn't throw an error
		//then print statement
		System.out.println("Registered");


		//establish a connection with the DB
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		//if connected
		//i.e. didn't throw an error
		//print statement
		System.out.println("Connected");


		//create statement object
		statement = connection.createStatement();


	}



	//close connection method
	//throws exception
	public static void closeConnection() throws SQLException {

		//if there is a connection open
		//i.e. connection object is NOT null
		if(connection != null) {

			//then close it
			//i.e. otherwise no connection exists
			connection.close();

			//print statement
			System.out.println("Connection closed");
		}
	}

	
	//method to return statement object
	public static Statement getStatement() {
		
		return statement;
	}

	
	//tester method
	public static void main(String[] args) {


		//test connection method so far
		//i.e. register JDBC driver + create connection
		//then close connection
		try {

			createConnection();
			closeConnection();

		}
		//catch sql error
		catch(SQLException e) {

			System.out.println("SQL Error -- " + e.getMessage());

		}
		//catch Linkage error
		catch(LinkageError e) {
			//print error message
			System.out.println("Linkage Error -- " + e.getMessage());
		}

		//catch class not found error
		catch(ClassNotFoundException e) {

			//print error message
			System.out.println("Class not found Error -- " + e.getMessage());
		}

		//catch general exception
		catch(Exception e) {

			//print error message
			System.out.println("General Error -- " + e.getMessage());
		}

	}

}
