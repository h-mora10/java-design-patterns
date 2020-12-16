package behavioral.visitor.solved;

public abstract class CarPart {

    void acceptCarPartVisitor(CarPartVisitor carPartVisitor) {
        carPartVisitor.visit(this);
    }
}
