package structural.facade.solved;

public class Client {

    public static void main(String[] args) {

        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();

        // Dependency injection
        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade(billingSystem, invoiceCustomerSystem);

        financialSystemFacade.createInvoice(1000);
    }
}
