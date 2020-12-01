package creational.factory.solved;

public class CarFactory extends TransportFactory {

    @Override
    Transport create() {
        return new Car();
    }
}
