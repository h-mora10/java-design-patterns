package structural.proxy.current;

import java.util.List;

public class App {

    private List<Image> images;

    public App(List<Image> images) {
        this.images = images;
    }

    public void draw() {
        for (Image image : this.images) {
            image.draw();
        }
    }
}
