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

        while(destination == location){
            destination = (int)(Math.random()*32 + 1);
        }

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

    public boolean isArrivedC(){
        return arrived;
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

    
    public boolean hasSpace(){
        if(passengerList.size() < 3){
            return true;
        }
        return false;
    }

    public void pickUpPassengers(ArrayList<Passenger> stationPassengers){
        for(int i = 0; i < stationPassengers.size(); i++){
            Passenger a = stationPassengers.get(i);
            if(hasSpace()){
                if(getDirectionC() == a.getDirectionP()){
                    passengerList.add(a);
                    stationPassengers.remove(i);
                    i--;
                }
            } else{
                break;
            }
        }

        }



    public void dropOff(){
        for(int i = 0; i < passengerList.size(); i++){
            Passenger p = passengerList.get(i);
            if(location == p.getDestinationP()){
                passengerList.remove(i);
                i--;
            }
        }
    }


    public void move(){
        if(!arrived){
            location += direction;
        }

        dropOff();

        if(location == destination){
            arrived = true;

            for(int i = 0; i < passengerList.size(); i++){
                passengerList.remove(i);
                i--;
            }
        } 
        
    }


}
