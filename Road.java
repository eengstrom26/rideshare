import java.util.*;

public class Road {
    private ArrayList<Station> stationList;
    private ArrayList<Car> carList;
    private ArrayList<Passenger> passengerList;


    public Road(int carNumber, int passengerNumber){
        stationList = new ArrayList<Station>();
        for(int i = 0; i < 32; i++){
            stationList.add(new Station(i));
        }

        carList = new ArrayList<Car>();
        for(int i = 0; i < carNumber; i++){
            carList.add(new Car());
        }

        passengerList = new ArrayList<Passenger>();
        for(int i = 1; i <= passengerNumber; i++){
            Passenger a = new Passenger();
            passengerList.add(a);
            for(Station x : stationList){
                if(x.getLocation() == a.getStartP()){
                    x.addPassenger(a);
                }
            }
        }
    
    }

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }

    public ArrayList<Station> getStationList(){
        return stationList;
    }
    

    public ArrayList<Car> getCarList(){
        return carList;
    }

    public void addPassengerStation(int station, Passenger passIn){
        for(Station x : stationList){
            if(x.getLocation() == station){
                x.addPassenger(passIn);
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
            currentCar.dropOff(stationList);

            int newLocation = currentCar.getLocationC();
            for(Station x : stationList){
                if(x.getLocation() == newLocation){
                    currentCar.pickUpPassengers(x.getPassengerList());
                    break;
                }
            }
        }
    }


}
