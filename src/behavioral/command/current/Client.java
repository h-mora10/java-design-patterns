package behavioral.command.current;

public class Client {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addText("1234");
        editor.clearText();

        System.out.println("Text is: " + editor.getText());

        // The undo functionality can only be used once
        editor.undo();

        System.out.println("Text is: " + editor.getText());

        // If we want to allow the user to parametrize or add extra functionality to the editor,
        // we need to write the code down ourselves im the editor to actually perform it.
    }
}
