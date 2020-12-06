package structural.bridge.solved;

public class LinuxWindow implements PlatformWindow {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing on linux x: " + x + ", y: " + y + ", width: " + width + ", height: " + height + ", color: " + color);
    }
}
