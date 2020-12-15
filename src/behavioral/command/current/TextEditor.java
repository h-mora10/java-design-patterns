package behavioral.command.current;

public class TextEditor {

    String text = "";

    String undoText = "";

    public void addText(String text) {
        undoText = this.text;
        this.text = text;
    }

    public void clearText() {
        undoText = text;
        text = "";
    }

    public String getText() {
        return text;
    }

    public void undo() {
        text = undoText;
    }
}
