import Initializing_Products.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Product e1 = new Electronics("Sire", 129.5, 23);
        Product e2 = new Electronics("Shirt", 129.5, 22);
        Product e3 = new Furniture("Chair", 127.7, 23);

        OrderManager orderManager = new OrderManager();
        orderManager.addProduct(e1);
        orderManager.addProduct(e2);
        orderManager.addProduct(e3);


        ;
        Collections.sort(orderManager.product_list,orderManager);
        orderManager.getalldata();




    }
}