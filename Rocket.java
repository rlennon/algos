public class Rocket
{
	private double weight;
	private double size;
	private String type;

	//constructor
	public Rocket(double weightIn, double sizeIn, String typeIn)
	{
		this.Weight = weightIn;
		this.Size = sizeIn;
		this.Type = typeIn;
	}

	// methods
	public double Weight
	{
		get { return weight; }
		set { weight = value; }
	}

	public double Size
	{
		get { return size; }
		set { size = value; }
	}

	public String Type
	{
		get { return type; }
		set { type = value; }
	}

	
	public String toString()
	{
		return this.Weight + " " + this.Size + " " + this.Type;
	}
}