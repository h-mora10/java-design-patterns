package behavioral.observer.solved;

public interface Publisher {

    void change();

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);
}
