package ss12;

import ss8_mvc.entity.Student;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        //cart
//        Map<Product,Integer> cart = new TreeMap<>();
//        cart.put(new Product(1,"samsung2"),10);
//        cart.put(new Product(22,"nokia"),10);
//        cart.put(new Product(1,"samsung"),100);
//        cart.put(new Product(3,"iphone"),20);
//
//        // duyệt map
//        Set<Product> productSet = cart.keySet();
//        for (Product product : productSet){
//            System.out.println(product +" : " + cart.get(product));
//        }

        Set<Product> set = new HashSet<>();
        set.add(new Product(1,"samsung"));
        set.add(new Product(1,"samsung"));
        set.add(new Product(1,"samsung"));

        for (Product product : set){
            System.out.println(product);
        }

    }
}
