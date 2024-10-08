package Initializing_Products;

public class Clothing extends Product{
    private static final double interest_rate = 0.10;

    public Clothing(String name, double price, int quantity) {
        super(name, price, quantity);
    }


    public double calculateTotalPrice() {

        return super.getPrice()+super.getPrice()*interest_rate;
    }
}


