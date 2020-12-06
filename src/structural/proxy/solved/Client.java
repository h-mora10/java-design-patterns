package structural.proxy.solved;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Image image = new ImageProxy("Test image #1");
        Image image2 = new ImageProxy("Test image #2");

        List<Image> images = new ArrayList<>();
        images.add(image);
        images.add(image2);

        App app = new App(images);

        System.out.println("App setup");

        // Images won't be loaded until reaching this point.
        // The draw method is the logic that actually needs the images, so they get instantiated at this moment.
        app.draw();
    }
}
