package vehicleClass;

//derived class
public class Train extends Vehicle  
{ 

	// the MountainBike subclass adds one more field 
	public int trainId; 

	// the MountainBike subclass has one constructor 
	public Train(int idIn, int driverIn, int noOfMinionsIn, int noOfTallMinionsIn, int noOfShortMinionsIn, int noOfTanksIn, int noOfTrainsIn, String locationIn, String typeIn, 
			int trainIdIn)
	{ 
		// invoking base-class(Bicycle) constructor 
		super( idIn,  driverIn,  noOfMinionsIn,  noOfTallMinionsIn,  noOfShortMinionsIn,  noOfTanksIn,  noOfTrainsIn,  locationIn,  typeIn);
		this.trainId = trainIdIn; 
	}  

	// the MountainBike subclass adds one more method 
	
	
	public void setVehicleType(String type)
    {
	   this.setType("Train");
    }

	// overriding toString() method 
	// of Bicycle to print more info 
	@Override
	public String toString() 
	{ 
		return (super.toString()+ 
				"\nTrain ID  "+trainId); 
	} 
}
