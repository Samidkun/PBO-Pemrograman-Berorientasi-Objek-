import java.util.Date;

// Interface for tracking orders
interface TrackableOrder {
    void trackOrderStatus();
}

// Abstract class for all Orders
public abstract class Order {
    protected Date orderDate;

    public Order(Date orderDate) {
        this.orderDate = orderDate;
    }

    // Abstract method to confirm order
    public abstract void confirmOrder();

    // Method to cancel order
    public void cancelOrder() {
        System.out.println("Order has been canceled.");
    }
}
