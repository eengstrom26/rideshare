public class Passenger {
    public int location;
    public int destination;
    private boolean arrived;
    public int id;
    private static int idGen = 1;
    //tostring

    public Passenger(){
        location = (int)(Math.random() * 32 + 1);
        destination = (int)(Math.random()*32 + 1);
        id = idGen;
        arrived = false;
        idGen++;
    }

    public boolean getArrivedP(){
        return arrived;
    }

    public void isArrived(){
        arrived = true;
    }

    public int getDestinationP(){
        return destination;
    }
    public int getLocationP(){
        return location;
    }

    public int getIDP(){
        return id;
    }

    public void moveP(int direction){
        location += direction;
    }
}
