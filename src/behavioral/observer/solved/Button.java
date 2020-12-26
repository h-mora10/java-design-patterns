package behavioral.observer.solved;

import java.util.ArrayList;
import java.util.List;

public class Button implements Publisher {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void clicked() {
        change();
    }

    @Override
    public void change() {
        for (Subscriber subscriber : this.subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
}
