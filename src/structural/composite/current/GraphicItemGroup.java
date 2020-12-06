package structural.composite.current;

import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup {

    private List<Line> lines = new ArrayList<>();

    private List<Rectangle> rectangles = new ArrayList<>();

    public List<Line> getLines() {
        return this.lines;
    }

    public List<Rectangle> getRectangles() {
        return this.rectangles;
    }

    public void draw() {
        for (Line line : this.lines) {
            line.draw();
        }

        for (Rectangle rectangle : this.rectangles) {
            rectangle.draw();
        }
    }
}
