package creational.factory.solved;

public class BikeFactory extends TransportFactory {

    @Override
    Transport create() {
        return new Bike();
    }
}
