package behavioral.observer.current;

public class Client {

    // When the button state changes (is clicked), the list and the text should be updated as well
    public static void main(String[] args) {
        Button button = new Button();
        InputText text = new InputText();
        List list = new List();

        button.setInputText(text);
        button.setList(list);

        button.clicked();
    }
}
