import java.util.Date;

// Concrete class for Whatsapp Orders
public class WhatsappOrder extends Order {

    public WhatsappOrder(Date orderDate) {
        super(orderDate);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Whatsapp Order has been confirmed.");
    }
}
