package structural.proxy.solved;

public class ImageProxy implements Image {

    private String url;

    private ImageService imageService;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void draw() {
        if (imageService == null) {
            imageService = new ImageService(url);
        }
        imageService.draw();
    }
}
