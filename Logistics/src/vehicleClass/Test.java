package vehicleClass;

public class Test {
	
	public static void main(String args[])  
    { 
          
        Tank tank1 = new Tank(1,1,3,4,5,6,7,"wad","",8,9,10, 11, 12);
        Tank tank2 = new Tank(1,99,10000,4,5,6,7,"wad","",8,9,10, 11, 12);
        System.out.println(tank1);
        System.out.println(tank1.getVehicleType());
        
        
        Train mb2 = new Train(1,2,3,4,5,6,7,"wad",null,8); 
        System.out.println(mb2.toString()); 
        System.out.println(mb2.getVehicleType());
        
       
        
        //Gets work sets work
        mb2.setVehicleType(null);
        tank1.setVehicleType(null);
        mb2.setLocation("Doc1");
        tank1.setLocation("Doc2");

        
        //mb2.setDriver(0);
        System.out.println(mb2.getVehicleType());
        System.out.println(tank1.getVehicleType());
        
        System.out.println(tank1.toString());
        System.out.println(mb2.toString());
        
        //mb.setDriver(1);
      //tank1.setId(0);
        System.out.println(tank1.getId());
        System.out.println(tank2.getId());
        System.out.println(tank1.getId());
        System.out.println(tank2.getId());
        //Train train = new Train();
        //Train.setHeight(1);
        //tank2.setHardLoaders(0);
        tank2.setDriver(99);
        //tank2.getDriver();
        //System.out.println(tank2.getnoOfLoaders());
        System.out.println(tank2.getDriver());
        
        System.out.println(tank2.getId());
        tank2.setDriver(12324);
        tank2.setnoOfTrains(2);//has to be less than 3 to work HAVE TO FIX FOR MINUS
        tank2.setnoOfTanks(5);//has to be less than 6 to work
        tank2.setnoOfMinions(3);
        tank2.setnoOfTallMinions(0);
        tank2.setnoOfShortMinions(0);
        tank2.setnoOfEasyRockets(3);
        tank2.setnoOfHardRockets(3);
        tank2.setShooter(2);
        tank2.setnoOfLoaders(1);
        //tank2.setEasyLoaders(0);
        //tank2.setHardLoaders(0);
        tank2.getnoOfRockets(1);
        System.out.println(tank2.getDriver());
        tank2.setVehicleType(null);
        tank2.setLocation("Port");
        System.out.println(tank2);
        //System.out.println(tank2.toString());
        //System.out.println(mb2.getId());
        //tank2.getnoOfHardRockets();
    } 

}
