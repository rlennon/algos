//class to connect to database
//Ciaran Toman
//11/11/2018


package jdbc;

public class DatabaseConnector {
	
	//instance fields
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	
	//methods
	
	//create connection method
	//throw exceptions
	private static void createConnection() throws LinkageError, ClassNotFoundException, Exception{
		
		//register JDBC
		Class.forName(DRIVER);
		
		//if registered 
		//i.e. it didn't throw an error
		//then print statement
		System.out.println("Registered");
		
		
	}

	
	//tester method
	public static void main(String[] args) {
		
		//test connection method so far
		//i.e. register JDBC driver
		try {
			
			createConnection();
			
			}
		
		//catch Linkage error
		catch(LinkageError e) {
				//print error message
				System.out.println("Linkage Error -- " + e.getMessage());
			}
		
		//catch class not found
		catch(ClassNotFoundException e) {
			
			//print error message
			System.out.println("Class not found Error -- " + e.getMessage());
		}
		
		//catch exception
		catch(Exception e) {
				
				//print error message
				System.out.println("General Error -- " + e.getMessage());
			}
		
		
		
	}

}
