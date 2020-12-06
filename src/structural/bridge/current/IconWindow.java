package structural.bridge.current;

public class IconWindow implements Window {

    // You could have a variable to switch implementations but it'd a very bad solution
    private boolean switchVersion;

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        // What kind of implementation do we expect here? Linux? DirectX?
    }

    public void drawIcon() {
        draw(0, 0, 10, 10, "White");
        draw(0, 10, 10, 10, "Black");
    }
}
