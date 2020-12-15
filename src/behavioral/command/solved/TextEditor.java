package behavioral.command.solved;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {

    private String text;

    private Queue<Command> queue = new LinkedList<>();

    public void executeAction(Command command) {
        command.action();
        queue.add(command);
    }

    public void undo() {
        Command command = queue.poll();
        if (command != null) {
            command.undo();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Queue<Command> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Command> queue) {
        this.queue = queue;
    }
}
