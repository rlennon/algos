package vehicleClass;

public class Vehicle {
	
	// the Bicycle class has two fields 
	public int id; 
	public int driver;
	public int noOfMinions;
	public int noOfTallMinions;
	public int noOfShortMinions;
	public int noOfTanks;
	public int noOfTrains;
	public String location = null;
	public String type = null;
    
          
    // the Bicycle class has one constructor 
    public Vehicle(int idIn, int driverIn, int noOfMinionsIn, int noOfTallMinionsIn, int noOfShortMinionsIn, int noOfTanksIn, int noOfTrainsIn, String locationIn, String typeIn) 
    { 
        id = idIn; 
        driver = driverIn;
        noOfMinions = noOfMinionsIn;
        noOfTallMinions = noOfTallMinionsIn;
        noOfShortMinions = noOfShortMinionsIn;
        noOfTanks = noOfTanksIn;
        noOfTrains = noOfTrainsIn;
        location = locationIn;
        type = typeIn;
        
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
    	return("Type is "+type);
    }
    
    //public void setDriver(int newValue) {
    //	this.driver = newValue;
	//} 
    
    public int getDriver()
    {
    	return driver;
    }
    
//    public void setnoOfTanks(int newValue) {
//    	this.noOfTanks = newValue;
//	} 
    
    public int getnoOfTanks()
    {
    	return noOfTanks;
    }
    
    public int getnoOfTrains()
    {
    	return noOfTrains;
    }
    
//    public void setnoOfMinions(int newValue) {
//    	this.noOfMinions = newValue;
//	} 
    
    public int getnoOfMinions()
    {
    	return noOfMinions;
    }
    
    public int getnoOfTallMinions()
    {
    	return noOfTallMinions;
    }
    
    public int getnoOfShortMinions()
    {
    	return noOfShortMinions;
    }
    
    
    
    
    
    
//    public String getDriver()
//    {
//    	return("Number of Drivers a "+driver);
//    }
    
    
          
    
      
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



