package behavioral.command.solved;

public class AddTextCommand extends EditorAbstractCommand {

    private String undoText = "";

    private String textToBeAdded = "";

    public AddTextCommand(TextEditor editor, String textToBeAdded) {
        super(editor);
        this.textToBeAdded = textToBeAdded;
    }

    @Override
    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText(getTextEditor().getText().concat(textToBeAdded));
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
