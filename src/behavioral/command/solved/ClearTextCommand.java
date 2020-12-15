package behavioral.command.solved;

public class ClearTextCommand extends EditorAbstractCommand {

    private String undoText = "";

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText("");
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
