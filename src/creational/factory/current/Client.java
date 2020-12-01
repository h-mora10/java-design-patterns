package creational.factory.current;

public class Client {

    public static void main(String[] args) {

        // But it can be any type of transport, we don't know which transport is required or implemented
        // The car implementation could be added at a later point
        Transport vehicle = new Transport();
        System.out.println(vehicle.drive());
    }
}
