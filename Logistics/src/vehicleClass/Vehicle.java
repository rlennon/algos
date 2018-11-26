package vehicleClass;

public class Vehicle {
	
	// the Bicycle class has two fields 
	private int id; 
    private int driver;
    private int noOfMinions;
    private int noOfTallMinions;
    private int noOfShortMinions;
    private int noOfTanks;
    private int noOfTrains;
    private String location = null;
    private String type = null;
    
          
    // the Bicycle class has one constructor 
    public Vehicle(int idIn, int driverIn, int noOfMinionsIn, int noOfTallMinionsIn, int noOfShortMinionsIn, int noOfTanksIn, int noOfTrainsIn, String locationIn, String typeIn) 
    { 
        this.id = idIn; 
        this.driver = driverIn;
        this.noOfMinions = noOfMinionsIn;
        this.noOfTallMinions = noOfTallMinionsIn;
        this.noOfShortMinions = noOfShortMinionsIn;
        this.noOfTanks = noOfTanksIn;
        this.noOfTrains = noOfTrainsIn;
        this.location = locationIn;
        this.type = typeIn;
        
    } 
          
    // the Bicycle class has three methods 
    public int getId() {
        return id;
      }

//      public void setId(int id) {
//        this.id = id;
//      }

    
    public void setLocation(String location) {
		this.location = location;
	} 
    
    public String getLocation() 
    { 
    	return("Location is "+location); 
    } 
    
    public void setType(String type) {
    	this.type = type;
	} 
     
    public String getVehicleType()
    {
    	return this.type;
    }
    
    public void setDriver(int driver) {
    	this.driver = driver;
	} 
    
    public int getDriver()
    {
    	return this.driver;
    }
          
    
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("Vehicle ID is "+id 
                +"\n"
                + "Number of Driver "+driver
                +"\n"
                + "Number of total minions "+noOfMinions
                +"\n"
                + "Number of Tall minions "+noOfTallMinions
                +"\n"
                + "Number of Short minions "+noOfShortMinions
                +"\n"
                + "Number of tanks "+noOfTanks
                +"\n"
                + "Number of trains "+noOfTrains
                +"\n"
                + "Location is "+location
                +"\n"
                + "Type is "+getVehicleType());
    }

	 

}



