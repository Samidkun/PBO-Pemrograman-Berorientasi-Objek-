import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create different types of orders
        Order mailOrder = new MailOrder(new Date());
        Order webOrder = new WebOrder(new Date());
        Order whatsappOrder = new WhatsappOrder(new Date());

        // Confirm the orders
        mailOrder.confirmOrder();
        webOrder.confirmOrder();
        whatsappOrder.confirmOrder();

        // Track order status for Trackable orders
        if (mailOrder instanceof TrackableOrder) {
            ((TrackableOrder) mailOrder).trackOrderStatus();
        }
        if (webOrder instanceof TrackableOrder) {
            ((TrackableOrder) webOrder).trackOrderStatus();
        }

        // Cancel orders
        mailOrder.cancelOrder();
        webOrder.cancelOrder();
        whatsappOrder.cancelOrder();
    }
}
