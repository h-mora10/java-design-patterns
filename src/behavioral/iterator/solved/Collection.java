package behavioral.iterator.solved;

public interface Collection<T> {

    T[] getItems();

    void addItem(T item);

    Iterator<T> getIterator();
}
