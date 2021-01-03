package behavioral.memento.solved;

import java.util.Stack;

public class ConnectingLineCaretaker {

    private Stack<ConnectingLineMemento> connectingLineMementosStack;

    public ConnectingLineCaretaker() {
        this.connectingLineMementosStack = new Stack<>();
    }

    public void saveState(ConnectingLine connectingLine) {
        connectingLineMementosStack.push(connectingLine.createMemento());
    }

    public void restoreState(ConnectingLine connectingLine) {
        connectingLine.setMemento(connectingLineMementosStack.pop());
    }
}
