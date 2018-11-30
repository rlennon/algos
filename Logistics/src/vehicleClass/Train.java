package vehicleClass;

//derived class
public class Train extends Vehicle  
{ 

	// the MountainBike subclass adds one more field 
	//public int trainId; 
	public int counter =1;

	// the MountainBike subclass has one constructor 
	public Train(int idIn, int driverIn, int noOfMinionsIn, int noOfTallMinionsIn, int noOfShortMinionsIn, int noOfTanksIn, int noOfTrainsIn, String locationIn, String typeIn, 
			int trainIdIn)
	{ 
		// invoking base-class(Bicycle) constructor 
		super( idIn,  driverIn,  noOfMinionsIn,  noOfTallMinionsIn,  noOfShortMinionsIn,  noOfTanksIn,  noOfTrainsIn,  locationIn,  typeIn);
		//this.trainId = trainIdIn; 
	}  
	
	public void setId(int id) {
		  
		  this.setId(counter);
		  counter++;
	    }
	
	public void setVehicleType(String type)
    {
	   this.setType("Train");
    }
	
	public void setDriver(int driverIn) 
	  { 
		  driverIn = 1; 
	  }  

	// overriding toString() method 
	// of Bicycle to print more info 
	@Override
	public String toString() 
	{ 
		return (super.toString());
				//"\nTrain ID  "+trainId); 
	} 
}
