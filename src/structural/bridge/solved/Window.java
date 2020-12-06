package structural.bridge.solved;

public class Window {

    private PlatformWindow window;

    public void draw(int x, int y, int width, int height, String color) {
        window.draw(x, y, width, height, color);
    }

    public void setWindow(PlatformWindow window) {
        this.window = window;
    }
}
