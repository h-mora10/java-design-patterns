package behavioral.observer.current;

public class Button {
    
    private InputText inputText;

    private List list;

    public void clicked() {
        list.setListValue(1);
        inputText.setText("Button has been clicked!");
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }

    public void setList(List list) {
        this.list = list;
    }
}
