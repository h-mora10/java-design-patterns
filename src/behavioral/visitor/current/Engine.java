package behavioral.visitor.current;

public class Engine extends CarPart {

    @Override
    void render() {
        System.out.println("Render Engine");
    }

    @Override
    void upgrade() {
        System.out.println("Upgrade Engine");
    }

    @Override
    void print() {
        System.out.println("Engine");
    }
}
