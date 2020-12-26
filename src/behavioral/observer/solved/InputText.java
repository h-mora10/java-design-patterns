package behavioral.observer.solved;

public class InputText implements Subscriber {

    public void setText(String text) {
        System.out.println("Input text: " + text);
    }

    @Override
    public void update() {
        this.setText("Button has been clicked!");
    }
}
