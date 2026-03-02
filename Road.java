import java.util.*;

public class Road {
    private ArrayList<Station> stationList;
    private ArrayList<Car> carList;
    private ArrayList<Passenger> passengerList;

    public Road(int carNumber, int passengerNumber){
        stationList = new ArrayList<Station>();
        for(int i = 1; i <= 32; i++){
            stationList.add(new Station(i));
        }

        carList = new ArrayList<Car>();
        for(int i = 1; i <= carNumber; i++){
            carList.add(new Car());
        }

        passengerList = new ArrayList<Passenger>();
        for(int i = 1; i <= passengerNumber; i++){
            Passenger a = new Passenger();
            passengerList.add(a);
            for(Station s : stationList){
                if(s.getLocation() == a.getStartP()){
                    s.addPassenger(a);
                }
            }
        }
    
    }

    public void addPassengerStation(int station, Passenger passIn){
        for(Station s : stationList){
            if(s.getLocation() == station){
                s.addPassenger(passIn);
            }
        }
    }

    public void advanceAllCars(){
        for(int i = 0; i < carList.size(); i++){
            Car currentCar = carList.get(i);
            Station currentStation = null;
            if(!currentCar.isArrivedC()){
                int carLocation = currentCar.getLocationC();
                for(int j = 0; j < stationList.size(); j++){
                    Station s = stationList.get(j);
                    if(s.getLocation() == carLocation){
                        currentStation = s;
                        break;
                    }
                }
            } if(currentStation != null){
                ArrayList<Passenger> waitingPassengers = currentStation.getPassengerList();
                currentCar.pickUpPassengers(waitingPassengers);
            }
            currentCar.move();
        }
    }

    public ArrayList<Station> getStationList(){
        return stationList;
    }
    

    public ArrayList<Car> getCarList(){
        return carList;
    }
}
