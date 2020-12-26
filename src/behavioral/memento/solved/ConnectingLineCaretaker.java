package behavioral.memento.solved;

public class ConnectingLineCaretaker {

    private ConnectingLineMemento connectingLineMemento;

    public void saveState(ConnectingLine connectingLine) {
        connectingLineMemento = connectingLine.createMemento();
    }

    public void restoreState(ConnectingLine connectingLine) {
        connectingLine.setMemento(connectingLineMemento);
    }
}
