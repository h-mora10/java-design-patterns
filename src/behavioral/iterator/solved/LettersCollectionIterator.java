package behavioral.iterator.solved;

public class LettersCollectionIterator implements Iterator<String> {

    private Collection<String> collection;

    private int position = 0;

    public LettersCollectionIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public String getNext() {
        if (!isDone()) {
            String item = collection.getItems()[position];
            position++;
            return item;
        }

        return null;
    }

    @Override
    public boolean isDone() {
        return position == collection.getItems().length;
    }
}
