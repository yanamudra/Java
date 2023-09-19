package exercise;

public class Main {
    public static void main(String[] args) {
        GasStation stationWOG = new GasStation(1.8);
        Car smallCar = new Car(3, 0.05, 50.0);
        smallCar.addPassengers("Tom");
        smallCar.addPassengers("Sheldon");
        smallCar.addPassengers("Jack");
        smallCar.addPassengers("Mark");
        smallCar.fillUp(stationWOG);
        smallCar.drive(80.0);
    }
}

//        Tom got into the car
//        Sheldon got into the car
//        Jack got into the car
//        The car is full, Mark can’t get in
//        Added 50.0 liters
//        Bill: € 90.0
//        Tom pays € 30.0
//        Sheldon pays € 30.0
//        Jack pays € 30.0
//        The car drove 80.0 km
//        Fuel left: 46.0 liters
//
//        Process finished with exit code 0

