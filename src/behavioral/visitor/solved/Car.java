package behavioral.visitor.solved;

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

    public void render() {
        RenderCarPartVisitor renderer = new RenderCarPartVisitor();

        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(renderer);
        }
    }

    public void upgrade() {
        UpgradeCarPartVisitor upgrader = new UpgradeCarPartVisitor();

        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(upgrader);
        }
    }

    public void print() {
        PrintCarPartVisitor printer = new PrintCarPartVisitor();

        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(printer);
        }
    }
}
