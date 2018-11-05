//Rory Friel Evil Minion Class

public class EvilMinion 
{

    //Variables  
    private int id;
    private double height;
    private double weight;
    private static int nextID =1;
    private string location;

    //Constructers
    EvilMinion(double height, double weight, string Location)
    {
        id = nextID++;
		this.height = height;
        this.weight = weight;
        this.Location = Location;
    }

    //Methods 
    public double getHeight()
    {
		return height;
    }
    
    public void setHeight(double height)
    {
		this.height = height;
    }
    
    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String Location()
    {
        return location;
    }


    public String toString()
    {
        return this.height  + " " + this.weight + "\n" + this.location + "\n" + id + " ";
    }
}




















