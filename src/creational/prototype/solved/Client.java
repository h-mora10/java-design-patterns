package creational.prototype.solved;

public class Client {

    public static void main(String[] args) {

        Image image = new Image();
        image.setUrl("http://test.com");

        GraphicTool tool = new GraphicTool(image);

        // what kind of graphic is created?
        Graphic graphic = tool.createGraphic();

        System.out.println("Graphic instance : " + graphic.getClass().getName());
        // this proves the state was also cloned
        System.out.println("Graphic url : " + graphic.getUrl());

        // update the state
        image.setUrl("http://anothertest.com");

        // clone again
        graphic = tool.createGraphic();
        System.out.println("Graphic url : " + graphic.getUrl());

        Video video = new Video();
        video.setUrl("http://test.com");

        tool.setPrototype(video);

        graphic = tool.createGraphic();

        System.out.println("Graphic instance : " + graphic.getClass().getName());
        System.out.println("Graphic url : " + graphic.getUrl());
    }
}
