public class RideshareTester {
    public static void main(String[] args) {
        
         System.out.println("Testing 20 cars");
        
        int numCars1 = 20;
        int numPassengers1 = 50;

        double total20 = 0;

        for(int i = 0; i < 100; i++){

        Road road1 = new Road(numCars1, numPassengers1);
        for(int j = 0; j < 33; j++){
            road1.advanceAllCars();     
        }
        
        int completed1 = 0;
        for(Station x : road1.getStationList()){
            completed1 += x.getCompletedPassengers().size();
        }

        double percentage1 = (completed1 / (double) numPassengers1)*100;
        total20 += percentage1;
    }

    double average20 = total20/100;
    System.out.println("Average with 20 cars: " + average20);



        System.out.println("Testing 40 cars");

        int numCars2 = 40;

        double total40 = 0;

        for(int i = 0; i < 100; i++){
        Road road2 = new Road(numCars2, numPassengers1);
        for(int j = 0; j < 33; j++){
            road2.advanceAllCars();     
        }

        int completed2 = 0;
        for(Station x : road2.getStationList()){
            completed2 += x.getCompletedPassengers().size();
        }

        double percentage2 = (completed2 / (double) numPassengers1)*100;
        total40 += percentage2;
        
    }
    double average40 = total40/100;
    System.out.println("Average with 40 cars: " + average40);
    }
/*
    int numCars = 20;
    int numPassengers = 50; 
    
    Road road1 = new Road(numCars, numPassengers);
        for(int j = 0; j < 33; j++){
            System.out.println("step: " + j);
            road1.advanceAllCars();     
        for(Car x : road1.getCarList()){
            System.out.println(x);
        }
        for(Station a : road1.getStationList()){
            System.out.println(a);
    }
}*/
    
}      
