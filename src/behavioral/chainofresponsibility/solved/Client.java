package behavioral.chainofresponsibility.solved;

public class Client {

    public static void main(String[] args) {

        PaymentCheckoutHandler paymentCheckoutHandler = new PaymentCheckoutHandler();
        CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();

        paymentCheckoutHandler.setNextHandler(customerInfoCheckoutHandler);

        paymentCheckoutHandler.handleCheckout();
    }
}
