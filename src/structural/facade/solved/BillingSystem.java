package structural.facade.solved;

public class BillingSystem {

    public Bill createBill(Integer amount) {
        return new Bill(amount);
    }
}
