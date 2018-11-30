package vehicleClass;

//derived class
public class Tank extends Vehicle  
{ 
    
  // the Tank subclass adds  more fields 
  //public int noOfDrivers;
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
      //noOfDrivers = noOfDriversIn;
      noOfRockets = noOfRocketsIn;
      noOfEasyRockets =noOfEasyRocketsIn;
      noOfHardRockets =noOfHardRocketsIn;
      noOfShooters =noOfShootersIn;
      noOfLoaders = noOfLoadersIn;
  }  
        
  // the Tank subclass adds one more method 
  public void setId(int id) {
	  
	  this.setId(counter);
	  counter++;
    }
  
  public void setDriver(int driver) 
  { 
	  //for setting option this.driver = driver; 
	  this.driver = 1; 
  } 
  
  public void setnoOfTanks(int noOfTanks) 
  { 	
	  if(noOfTanks <= 5 && noOfTanks >= 1)
	  this.noOfTanks = noOfTanks; 
	  else this.noOfTanks=0;
  } 
  
  public void setnoOfTrains(int noOfTrains) 
  { 
	  if(noOfTrains <= 2 && noOfTrains >= 1)
	  this.noOfTrains = noOfTrains; 
	  else this.noOfTrains=0;
  } 
  
  public void setnoOfMinions(int noOfMinions) 
  { 
	  //if(noOfTallMinions <= 10 && noOfTallMinions >= 3 || noOfShortMinions <= 5 && noOfShortMinions >= 3)
     if(noOfMinions <= 10 && noOfMinions >= 3)
	  this.noOfMinions = noOfMinions; 
	  else this.noOfMinions=0;
	  //this.noOfTallMinions + this.noOfShortMinions
  } 
  
  public void setnoOfTallMinions(int noOfTallMinions) 
  { 
	  this.noOfTallMinions=1;
	  //unit size
  } 
  
  public void setnoOfShortMinions(int noOfShortMinions) 
  { 
	  this.noOfShortMinions=2;
	  //unit size
  } 
  
  public int setnoOfRockets()
  {
  	return noOfRockets;
  }
  
  public void getnoOfRockets(int noOfRockets) 
  { 
	  if(noOfRockets <= 2 && noOfRockets >= 1)
	  this.noOfRockets=noOfRockets;
	  else this.noOfRockets = 0;
	  //unit size
  } 
  
  public void  setnoOfEasyRockets(int noOfEasyRockets)
  {
  	 this.noOfEasyRockets=2;
  }
  
  public void  setnoOfHardRockets(int noOfHardRockets)
  {
  	 this.noOfHardRockets=1;
  }
  
  public int getnoOfEasyRockets()
  {
  	return noOfEasyRockets;
  }
  
  public int getnoOfHardRockets()
  {
  	return noOfHardRockets;
  }
  
 
  
//  public int getnoOfLoaders() 
//  { 
//	  return this.noOfLoaders; 
//  }  
  public void setnoOfLoaders(int noOfLoaders) 
  {
	  if(noOfLoaders <= 2 && noOfLoaders >= 1)
		  this.noOfLoaders=noOfLoaders;
		  else this.noOfLoaders = 0;
  } 
   
  public int getnoOfLoaders()
  {
	  return this.noOfLoaders;
  }
  
  public void setShooter(int noOfShooters) 
  { 
	  this.noOfShooters = 1; 
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