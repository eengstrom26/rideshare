public class Passenger {
    public int destination;
    private int start;
    public int id;
    private static int idGen = 1;
    //tostring

    public Passenger(){
        destination = (int)(Math.random()*32 + 1);
        start = (int)(Math.random()*32 + 1);

        while(destination == start){
            destination = (int)(Math.random()*32 + 1);
        }
        id = idGen;
        idGen++;
    }

    public int getStartP(){
        return start; 
    }

    public int getDestinationP(){
        return destination;
    }

    public int getIDP(){
        return id;
    }

}
