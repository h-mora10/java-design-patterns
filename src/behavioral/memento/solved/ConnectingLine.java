package behavioral.memento.solved;

import java.awt.geom.Point2D;

public class ConnectingLine {

    private Point2D pointA;

    private Point2D pointB;

    public void drawLine() {
        System.out.println("Drawing line between: " + pointA + " and " + pointB);
    }

    public ConnectingLineMemento createMemento() {
        return new ConnectingLineMemento(pointA, pointB);
    }

    public void setMemento(ConnectingLineMemento connectingLineMemento) {
        setPointA(connectingLineMemento.getPointA());
        setPointB(connectingLineMemento.getPointB());
    }

    public void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }
}
