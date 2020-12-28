package behavioral.mediator.solved;

public class Client {

    public static void main(String[] args) {

        List list = new List();
        InputText text = new InputText();

        ScreenMediator mediator = new ScreenMediator();
        mediator.setInputText(text);

        list.setMediator(mediator);

        list.getItems().add("Data #1");
        list.getItems().add("Data #2");
        list.getItems().add("Data #3");

        list.selectItem(1);

        System.out.println("Selected item is: " + text.getValue());
    }
}
