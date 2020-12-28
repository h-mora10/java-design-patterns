package behavioral.visitor.solved;

public class RenderCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Render " + carPart.getClass().getCanonicalName());
    }
}