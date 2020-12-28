package behavioral.chainofresponsibility.solved;

public class CustomerInfoCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Adding extra info to checkout of customer");

        runNextHandler();
    }
}
