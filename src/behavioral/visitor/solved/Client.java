package behavioral.visitor.solved;


public class Client {

    public static void main(String[] args) {

        Car car = new Car();

        // Original classes are untouched

        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());

        car.getCarParts().add(new Light());
        car.getCarParts().add(new Light());

        car.getCarParts().add(new Engine());

        car.upgrade();
        car.print();
        car.render();
    }
}
