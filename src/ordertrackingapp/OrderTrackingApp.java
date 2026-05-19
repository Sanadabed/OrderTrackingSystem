/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordertrackingapp;

import java.util.ArrayList;
import java.util.List;

public class OrderTrackingApp {
    public static void main(String[] args) {
        
        System.out.println("============================================================");
        System.out.println("   ORDER TRACKING SYSTEM - Observer Pattern                 ");
        System.out.println("============================================================");
        System.out.println();
        
        List<Observer> observers = new ArrayList<>();
        
        OrderSystem orderSystem = new OrderSystem(observers, "Order Tracking System [2024]");
        
        CustomerObserver customer = new CustomerObserver("Ahmed");
        StoreObserver store = new StoreObserver("Amazon Store");
        ShippingObserver shipping = new ShippingObserver("Aramex");
        
        orderSystem.subscribeObserver(customer);
        orderSystem.subscribeObserver(store);
        orderSystem.subscribeObserver(shipping);
        
        System.out.println("\n------------------------------------------------------");
        
        System.out.println("\n=== Order Status Flow ===\n");
        
        orderSystem.setOrderStatus("ORD-001", "Processing", "");
        
        orderSystem.setOrderStatus("ORD-001", "Shipped", "TRK123456789");
        
        System.out.println("\n------------------------------------------------------");
        
        System.out.println("\nUnsubscribing customer...");
        orderSystem.unSubscribeObserver(customer);
        
        System.out.println("\n------------------------------------------------------");
        
        orderSystem.setOrderStatus("ORD-001", "Out for Delivery", "TRK123456789");
        orderSystem.setOrderStatus("ORD-001", "Delivered", "TRK123456789");
        
        System.out.println("\n============================================================");
        System.out.println("Order Tracking System completed!");
        System.out.println("============================================================");
    }
}