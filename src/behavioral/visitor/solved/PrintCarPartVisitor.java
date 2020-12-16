package behavioral.visitor.solved;

public class PrintCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println(carPart.getClass().getCanonicalName());
    }
}
