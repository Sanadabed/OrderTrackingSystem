/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordertrackingapp;
public class StoreObserver implements Observer {
   private String storeName;
   public StoreObserver(String storeName) {
       this.storeName = storeName;
   }
   @Override
   public void update(String orderId, String status, String trackingNumber) {
       System.out.println("Store Update");
       System.out.println("Store: " + storeName);
       System.out.println("Order ID: " + orderId);
       System.out.println("New Status: " + status);
       System.out.println("---");
   }
}