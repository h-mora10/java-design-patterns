package structural.proxy.solved;

public class ImageService implements Image {

    private String url;

    public ImageService(String url) {
        System.out.println("Loading image...");
        this.url = url;
    }

    @Override
    public void draw() {
        System.out.println("Draw image from url: " + url);
    }
}
