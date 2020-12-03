package structural.facade.current;

public class BillingSystem {

    public Bill createBill(Integer amount) {
        return new Bill(amount);
    }
}
