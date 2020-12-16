package behavioral.visitor.current;

public class Light extends CarPart {

    @Override
    void render() {
        System.out.println("Render Light");
    }

    @Override
    void upgrade() {
        System.out.println("Upgrade Light");
    }

    @Override
    void print() {
        System.out.println("Light");
    }
}
