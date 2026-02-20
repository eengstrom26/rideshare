import java.util.*;

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

    public int getLocationC(){
        return location;
    }

    public int getDirectionC(){
        return direction;
    }

    public void isArrivedC(){
        arrived = true;
    }

    public int getIDC(){
        return id;
    }

    public int getPassengerCount(){
        return passengerList.size();
    }

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }

    public void move(){
        if(!arrived){
            location += direction;
        }
        if(location == destination){
            arrived = true;
        } //maybe add passenger dropoff here but idk
    }
}
