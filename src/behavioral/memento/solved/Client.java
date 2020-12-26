package behavioral.memento.solved;

import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {

        ConnectingLineCaretaker caretaker = new ConnectingLineCaretaker();

        ConnectingLine line = new ConnectingLine();
        line.setPointA(new Point2D.Double(1.0, 1.0));
        line.setPointB(new Point2D.Double(5.0, 1.0));

        line.drawLine();

        // save state
        caretaker.saveState(line);

        // change the state
        line.setPointA(new Point2D.Double(2.0, 6.5));
        line.setPointB(new Point2D.Double(3.0, 6.5));

        line.drawLine();

        // restore the state
        caretaker.restoreState(line);

        line.drawLine();
    }
}
