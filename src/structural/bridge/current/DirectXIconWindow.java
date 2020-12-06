package structural.bridge.current;

public class DirectXIconWindow implements Window {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing icon on directx x: " + x + ", y: " + y + ", width: " + width + ", height: " + height);;
    }

    public void drawIcon() {
        draw(0, 0, 10, 10, "White");
        draw(0, 10, 10, 10, "Black");
    }
}
