/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordertrackingapp;

public class ShippingObserver implements Observer {

   private String companyName;

   public ShippingObserver(String companyName) {
       this.companyName = companyName;
   }

   @Override
   public void update(String orderId, String status, String trackingNumber) {

       System.out.println("Shipping Company Update");
       System.out.println("Company: " + companyName);
       System.out.println("Order ID: " + orderId);
       System.out.println("Shipping Status: " + status);
       System.out.println("Tracking Number: " + trackingNumber);
       System.out.println("-----------------------------");
   }
}