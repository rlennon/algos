public class Delivery
    private int id;
    private String destination;
    private String status;

    public Delivery(int idIn, String destinationIn, String statusIn)
    {
        id = idIn;
        destination = destinationIn;
        status = statusIn;
    }

    public int getId(){
        return this.id;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getStatus(){
        return this.status;
    }
}