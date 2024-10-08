package Initializing_Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrderManager implements Comparator<Product> {
    public ArrayList<Product> product_list;
    public OrderManager() {
        product_list = new ArrayList<>();
    }

    public void addProduct(Product p) {
        product_list.add(p);
    }
    public void removeProduct(Product p) {
        product_list.remove(p);
    }
    public void sortdata(){
        Collections.sort(product_list,this);

    }
    public void getalldata(){
        for(int i=0;i<product_list.size();i++){
            System.out.println(product_list.get(i).getName()+" "+product_list.get(i).getPrice()+" "+product_list.get(i).getQuantity()+" "+product_list.get(i).calculateTotalPrice());
        }
    }


    @Override
    public int compare(Product product1, Product product2) {
        int compareValue  = (int)product1.calculateTotalPrice() - (int)product2.calculateTotalPrice();
        if(compareValue==0){

            return product1.getName().compareTo(product2.getName());
        }
        else{
            return compareValue;
        }

    }
}