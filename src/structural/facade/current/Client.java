package structural.facade.current;

public class Client {

    public static void main(String[] args) {

        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();

        // The clients needs to know that it must create a bill through the billing
        // system first, then it needs to call the invoice customer to create the invoice.
        // Seems like complex steps for the client.
        Bill bill = billingSystem.createBill(1000);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }
}
