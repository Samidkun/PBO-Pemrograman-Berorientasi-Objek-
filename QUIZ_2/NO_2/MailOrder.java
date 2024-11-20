import java.util.Date;

// Concrete class for Mail Orders
public class MailOrder extends Order implements TrackableOrder {

    public MailOrder(Date orderDate) {
        super(orderDate);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Mail Order has been confirmed.");
    }

    @Override
    public void trackOrderStatus() {
        System.out.println("Tracking Mail Order status...");
    }
}
