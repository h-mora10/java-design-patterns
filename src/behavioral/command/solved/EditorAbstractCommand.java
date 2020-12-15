package behavioral.command.solved;

public abstract class EditorAbstractCommand implements Command {

    // Abstract command to interact with the text editor only.

    private TextEditor textEditor;

    public EditorAbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
