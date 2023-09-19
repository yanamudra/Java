package exercise;

public class Car {
    private String[] passengers;
    private int nrSeats;
    private int busySeats;
    private double fuelConsumption;
    private double fuel;
    private double sizeTank;

    public Car(int nrSeats, double fuelConsumption, double sizeTank) {
        this.nrSeats = nrSeats;
        this.passengers = new String[nrSeats];
        this.fuelConsumption = fuelConsumption;
        this.sizeTank = sizeTank;
        this.busySeats = 0;
        this.fuel = 0;
    }

    public void addPassengers(String passenger) {
        if (busySeats < nrSeats) {
            passengers[busySeats] = passenger;
            busySeats++;
            System.out.println(passenger + " got into the car");
        } else {
            System.out.println("The car is full, " + passenger + " can’t get in");
        }
    }
String i;
    private void payBill(double bill) {
        double amount = bill / busySeats;
        for (int i = 0; i < busySeats; i++) {
            System.out.println(passengers[i] + " pays € " + amount);
        }
    }


    public void fillUp(GasStation station){
        double addedFuel = sizeTank - fuel;
        fuel = sizeTank;
        System.out.println("Added " + addedFuel + " liters");
        double newBill = station.getBill(addedFuel);
        this.payBill(newBill);
    }

    public void drive(double distance){
        System.out.println("The car drove " + distance + " km");
        fuel = fuel - distance * fuelConsumption;
        System.out.println("Fuel left: " + fuel + " liters");
    }
}
