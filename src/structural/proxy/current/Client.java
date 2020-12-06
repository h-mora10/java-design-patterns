package structural.proxy.current;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // images are very expensive to create and we might not need them all at once
        Image image = new Image("Test image #1");
        Image image2 = new Image("Test image #2");

        List<Image> images = new ArrayList<>();
        images.add(image);
        images.add(image2);

        App app = new App(images);

        System.out.println("App setup");

        app.draw();
    }
}
