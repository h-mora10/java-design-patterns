package creational.factory.solved;

public class Client {

    public static void main(String[] args) {

        TransportFactory factory = new BikeFactory();
        Transport transport = factory.create();
        System.out.println(transport.drive());

        // the client only needs to take care of the factory and it can be changed at runtime
        factory = new CarFactory();
        transport = factory.create();
        System.out.println(transport.drive());
    }
}
