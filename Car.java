public class Car {
    private int direction;
    private int location;
    private int destination;
    private boolean arrived;
    private ArrayList<Passenger> passengerList;
    private int id;
    private static int idGen = 1;

    public Car(){
        location = (int)(Math.random()* 32 + 1);
        destination = (int)(Math.random() * 32 + 1);
        passengerList = new ArrayList<Passenger>();
        if(location < destination){
            direction = 1;
        } else{
            direction = -1;
        }
        id = idGen;
        idGen++;
    }
}
