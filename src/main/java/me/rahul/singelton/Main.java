package me.rahul.singelton;

public class Main {
    public static void main(String[] args) {
        ShippingService shippingService1 = ShippingService.getInstance();
        ShippingService shippingService2 = ShippingService.getInstance();
        
        System.out.println("Are both references pointing to the same instance? " + (shippingService1 == shippingService2));  
    }
}
