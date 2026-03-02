import java.util.*;

public class Station {
    private ArrayList<Passenger> passengerList;
    private ArrayList<Passenger> completedPassengers;
    private int location;
    //tostring

    public Station(int locationIn){
        location = locationIn;
        passengerList = new ArrayList<Passenger>();
        completedPassengers = new ArrayList<Passenger>();
    }

    public void addPassenger(Passenger a){
        passengerList.add(a);
    }

    public void removePassenger(Passenger a){
        passengerList.remove(a);
    }

    public int getLocation(){
        return location;
    }

    public void addCompletedPassengers(Passenger a){
        completedPassengers.add(a);
    }

}
