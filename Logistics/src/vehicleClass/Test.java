package vehicleClass;

public class Test {
	
	public static void main(String args[])  
    { 
          
        Tank tank1 = new Tank(1,2,3,4,5,6,7,"wad","",8,9,10, 11, 12);
        Tank tank2 = new Tank(1,2,3,4,5,6,7,"wad","",8,9,10, 11, 12);
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
        //Train train = (Train) Vehicle;
        //Train.setHeight(1);
              
    } 

}
