package behavioral.iterator.solved;

public class LettersCollection implements Collection<String> {

    private String[] items = new String[5];

    public LettersCollection() {
        items[0] = "A";
        items[1] = "B";
        items[2] = "C";
        items[3] = "D";
        items[4] = "E";
    }

    @Override
    public String[] getItems() {
        return items;
    }

    @Override
    public void addItem(String item) {
        String[] tempCollection = items;
        items = new String[items.length + 1];
        for (int i=0; i<tempCollection.length; i++) {
            items[i] = tempCollection[i];
        }
        items[items.length - 1] = item;
    }

    @Override
    public Iterator<String> getIterator() {
        return new LettersCollectionIterator(this);
    }
}
