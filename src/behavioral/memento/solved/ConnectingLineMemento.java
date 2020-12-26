package behavioral.memento.solved;

import java.awt.geom.Point2D;

public class ConnectingLineMemento {

    private Point2D pointA;

    private Point2D pointB;

    public ConnectingLineMemento(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point2D getPointA() {
        return pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }
}
