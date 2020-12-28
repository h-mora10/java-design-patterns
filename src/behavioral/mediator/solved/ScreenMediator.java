package behavioral.mediator.solved;

public class ScreenMediator implements Mediator {

    private InputText inputText;

    @Override
    public void itemSelected(String item) {
        inputText.setValue(item);
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
