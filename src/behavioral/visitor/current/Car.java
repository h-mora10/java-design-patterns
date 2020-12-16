package behavioral.visitor.current;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarPart> carParts;

    public Car() {
        carParts = new ArrayList<>();
    }

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    // Problem here is each part contains specific implementations for functionality
    // that's not really related to the car part

    public void render() {
        for (CarPart carPart : carParts) {
            carPart.render();
        }
    }

    public void upgrade() {
        for (CarPart carPart : carParts) {
            carPart.upgrade();
        }
    }

    public void print() {
        for (CarPart carPart : carParts) {
            carPart.print();
        }
    }
}
