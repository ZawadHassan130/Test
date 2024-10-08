package Initializing_Products;

public class Furniture extends Product{
    private static final double interest_rate = 0.08;

    public Furniture(String name, double price, int quantity) {
        super(name, price, quantity);
    }


    public double calculateTotalPrice() {

        return super.getPrice()+super.getPrice()*interest_rate;
    }
}
