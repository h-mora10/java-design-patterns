package behavioral.chainofresponsibility.solved;

public abstract class CheckoutHandler implements Handler {

    protected Handler nextHandler;

    @Override
    public abstract void handleCheckout();

    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void runNextHandler() {
        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }
    }
}
