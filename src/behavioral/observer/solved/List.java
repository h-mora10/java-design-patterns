package behavioral.observer.solved;

public class List implements Subscriber {

    public void setListValue(int value) {
        System.out.println("List value: " + value);
    }

    @Override
    public void update() {
        this.setListValue(1);
    }
}
