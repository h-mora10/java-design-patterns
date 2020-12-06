package structural.decorator.solved;

public class Client {

    public static void main(String[] args) {

        // Base class to be decorated
        Window window = new Window();

        // Window with an icon
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
        // Window with an icon and a scroll bar
        ScrollBarWindowDecorator scrollBarWindowDecorator = new ScrollBarWindowDecorator(iconWindowDecorator);

        scrollBarWindowDecorator.draw();
    }
}
