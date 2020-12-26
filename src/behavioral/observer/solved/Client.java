package behavioral.observer.solved;

public class Client {

    public static void main(String[] args) {
        Button button = new Button();

        InputText inputText = new InputText();
        List list = new List();

        button.subscribe(inputText);
        button.subscribe(list);

        button.clicked();
    }
}
