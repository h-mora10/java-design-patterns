package structural.bridge.current;

public class LinuxWindow implements Window {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing on linux x: " + x + ", y: " + y + ", width: " + width + ", height: " + height);
    }
}
