package structural.decorator.current;

public class Client {

    public static void main(String[] args) {

        IconWindow iconWindow = new IconWindow();
        iconWindow.draw();

        ScrollBarWindow scrollBarWindow = new ScrollBarWindow();
        scrollBarWindow.draw();

        // If you want to create a window with an icon and a scroll bar
        // you can't use both existing classes, you would need to define a
        // new subclass IconScrollBarWindow. And keep doing it for every
        // new desired configuration
        IconScrollBarWindow iconScrollBarWindow = new IconScrollBarWindow();
        iconScrollBarWindow.draw();
    }
}
