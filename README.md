# Order Tracking System – Observer Pattern

## Project Idea
An order tracking system that automatically notifies multiple parties (customer, store, shipping company) when the order status changes.

## Features
- Track order status through multiple stages (Received, Preparing, Shipped, Out for Delivery, Delivered)
- Automatic notifications to all subscribers
- Easy to add new observers without modifying existing code
- Loose coupling between the order system and other components

## Design Pattern Used
**Observer Pattern** – Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.


## How to Run

### Prerequisites
- Java JDK 17 or higher

### Steps

```bash
git clone https://github.com/Sanadabed/OrderTracking.git
cd OrderTracking
javac src/ordertrackingapp/*.java
java -cp src ordertrackingapp.OrderTrackingApp

Sample Output
============================================================
   ORDER TRACKING SYSTEM - Observer Pattern                 
============================================================

Subscribing Ahmed [Amman] to Order Tracking System...
Subscribed successfully.
Subscribing Store [Warehouse] to Order Tracking System...
Subscribed successfully.
Subscribing Shipping [Aramex] to Order Tracking System...
Subscribed successfully.

=== Order Status Flow ===

[Ahmed] Order ORD-001 is Processing
[Store] Order ORD-001 status: Processing
[Shipping] Order ORD-001 status: Processing

[Ahmed] Order ORD-001 is Shipped
[Ahmed] Tracking: TRK123
[Store] Order ORD-001 status: Shipped
[Shipping] Order ORD-001 status: Shipped
[Shipping] Tracking: TRK123

============================================================
Order Tracking System completed!
============================================================
