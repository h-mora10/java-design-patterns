package behavioral.mediator.current;

public class Client {

    public static void main(String[] args) {

        List list = new List();
        InputText text = new InputText();

        list.setInputText(text);

        list.getItems().add("Data #1");
        list.getItems().add("Data #2");
        list.getItems().add("Data #3");

        list.selectItem(1);

        System.out.println("Selected item is: " + text.getValue());

        // The problem is that the list reference an input text but if you want to reuse
        // the list in other screens, those screens might not have a input text but still
        // require a list. Or those screens might have additional components, which would
        // have to be linked to the list
    }
}
