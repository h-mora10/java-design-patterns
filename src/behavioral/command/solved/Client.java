package behavioral.command.solved;

public class Client {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.setText("1234");

        Command command = new ClearTextCommand(editor);
        editor.executeAction(command);

        System.out.println("Text is: " + editor.getText());

        editor.undo();

        System.out.println("Text is: " + editor.getText());

        // A new command can be added without major changes

        String textToAdd = " is a fun text!";
        command = new AddTextCommand(editor, textToAdd);
        editor.executeAction(command);

        System.out.println("Text is: " + editor.getText());

        editor.undo();

        System.out.println("Text is: " + editor.getText());
    }
}
