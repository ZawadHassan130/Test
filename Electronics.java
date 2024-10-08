package Initializing_Products;

public class Electronics extends Product {


    private static final double interest_rate = 0.15;

    public Electronics(String name, double price, int quantity) {
        super(name, price, quantity);
    }


    public double calculateTotalPrice() {

        return super.getPrice()+super.getPrice()*interest_rate;
    }
}
