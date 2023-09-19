package exercise;

public class GasStation {

    private double price;

    public GasStation(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public double getBill(double liters){
        double bill = price * liters;
        System.out.println("Bill: € " + bill); /// "\u20ac"
        return bill;
    }

}
