package structural.bridge.solved;

public class DirectXWindow implements PlatformWindow {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing on directx x: " + x + ", y: " + y + ", width: " + width + ", height: " + height + ", color: " + color);
    }
}
