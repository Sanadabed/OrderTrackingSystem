/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordertrackingapp;
public class CustomerObserver implements Observer {
   private String customerName;
   public CustomerObserver(String customerName) {
       this.customerName = customerName;
   }
   @Override
   public void update(String orderId, String status, String trackingNumber) {
       System.out.println("Customer Notification");
       System.out.println("Customer: " + customerName);
       System.out.println("Order ID: " + orderId);
       System.out.println("Status: " + status);
       System.out.println("Tracking Number: " + trackingNumber);
       System.out.println("------------");
   }
}
