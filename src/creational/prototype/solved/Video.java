package creational.prototype.solved;

public class Video extends Graphic {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        Video clone = new Video();
        clone.setUrl(this.url);
        return clone;
    }

    @Override
    public String getUrl() {
        return this.url;
    }
}
