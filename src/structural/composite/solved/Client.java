package structural.composite.solved;

public class Client {

    public static void main(String[] args) {

        Line line = new Line();
        Rectangle rectangle = new Rectangle();

        GraphicItemGroup group = new GraphicItemGroup();
        group.getGraphics().add(line);
        group.getGraphics().add(rectangle);

        group.draw();

        System.out.println("---");

        Line line2 = new Line();
        GraphicItemGroup complexGroup = new GraphicItemGroup();
        complexGroup.getGraphics().add(line2);
        complexGroup.getGraphics().add(group);

        complexGroup.draw();
    }
}
