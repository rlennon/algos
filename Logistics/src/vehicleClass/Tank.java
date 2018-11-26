package vehicleClass;

//derived class
public class Tank extends Vehicle  
{ 
    
  // the Tank subclass adds  more fields 
  public int noOfRockets;
  public int noOfEasyRockets;
  public int noOfHardRockets;
  public int noOfShooters;
  public int noOfLoaders;
  public int counter;
  

  // the Tank subclass has one constructor 
  public Tank(int idIn, int driverIn, int noOfMinionsIn, int noOfTallMinionsIn, int noOfShortMinionsIn, int noOfTanksIn, int noOfTrainsIn, String locationIn, String typeIn, 
                      int noOfRocketsIn, int noOfEasyRocketsIn, int noOfHardRocketsIn, int noOfShootersIn, int noOfLoadersIn) 
  { 
      // invoking base-class(Vehicle) constructor 
      super( idIn,  driverIn,  noOfMinionsIn,  noOfTallMinionsIn,  noOfShortMinionsIn,  noOfTanksIn,  noOfTrainsIn,  locationIn,  typeIn);
      this.noOfRockets = noOfRocketsIn;
      this.noOfEasyRockets =noOfEasyRocketsIn;
      this.noOfHardRockets =noOfHardRocketsIn;
      this.noOfShooters =noOfShootersIn;
      this.noOfLoaders = noOfLoadersIn;
  }  
        
  // the Tank subclass adds one more method 
  public void setId(int id) {
	  
	  this.setId(counter);
	  counter++;
    }
  
  public void setDriver(int driver) 
  { 
	  this.setDriver(driver); 
  }  
  
  public void setEasyLoaders(int newValue) 
  { 
	  noOfLoaders = 1; 
  }  
  
  public void setHardLoaders(int newValue) 
  { 
	  noOfLoaders = 1; 
  }  
  
  public void setShooter(int newValue) 
  { 
	  noOfShooters = 1; 
  }  
  
  public void setVehicleType(String type)
  {
	   this.setType("Tank");
  }
    
  // overriding toString() method 
  // of Vehicle to print more info 
  @Override
  public String toString() 
  { 
      return (super.toString()+ 
              "\nNumber of Total Rockets are " +noOfRockets
              +"\n"
              + "Number of Easy Rockets "+noOfEasyRockets
              +"\n"
              + "Number of Hard Rockets "+noOfHardRockets
              +"\n"
              + "Number of Shooters "+noOfShooters
              +"\n"
              + "Number of Loaders "+noOfLoaders
              ); 
  } 
    
} 