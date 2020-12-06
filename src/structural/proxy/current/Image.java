package structural.proxy.current;

public class Image {

    private String url;

    public Image(String url) {
        System.out.println("Loading image...");
        this.url = url;
    }

    public void draw() {
        System.out.println("Draw image from url: " + url);
    }
}
