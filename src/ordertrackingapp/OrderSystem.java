/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordertrackingapp;

import java.util.List;

public class OrderSystem implements Subject {
    private final List<Observer> observers;
    private String orderId;
    private String status;
    private String trackingNumber;
    private final String subjectDetails;
    
    public OrderSystem(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }
    
    public void setOrderStatus(String orderId, String status, String trackingNumber) {
        this.orderId = orderId;
        this.status = status;
        this.trackingNumber = trackingNumber;
        notifyObservers();
    }
    
    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getClass().getSimpleName() + " subscribed to " + subjectDetails);
    }
    
    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
            System.out.println(observer.getClass().getSimpleName() + " unsubscribed from " + subjectDetails);
        }
    }
    
    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : observers) {
            observer.update(orderId, status, trackingNumber);
        }
    }
    
    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}