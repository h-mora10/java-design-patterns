package structural.decorator.current;

public class IconScrollBarWindow extends Window {

    @Override
    public void draw() {
        System.out.println("Draw icon");
        System.out.println("Draw Scroll bar");
        super.draw();
    }
}
