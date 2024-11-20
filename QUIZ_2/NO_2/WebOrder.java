import java.util.Date;

// Concrete class for Web Orders
public class WebOrder extends Order implements TrackableOrder {

    public WebOrder(Date orderDate) {
        super(orderDate);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Web Order has been confirmed.");
    }

    @Override
    public void trackOrderStatus() {
        System.out.println("Tracking Web Order status...");
    }
}
