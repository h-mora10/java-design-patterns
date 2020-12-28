package behavioral.chainofresponsibility.solved;

public class PaymentCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Handling payment of the customer");

        runNextHandler();
    }
}
