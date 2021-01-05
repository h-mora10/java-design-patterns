package behavioral.iterator.current;

public class Collection {

    private String[] items = new String[5];

    public Collection() {
        items[0] = "A";
        items[1] = "B";
        items[2] = "C";
        items[3] = "D";
        items[4] = "E";
    }

    public String[] getItems() {
        return items;
    }

    public void addItem(String item) {
        String[] tempCollection = items;
        items = new String[items.length + 1];
        for (int i=0; i<tempCollection.length; i++) {
            items[i] = tempCollection[1];
        }
        items[items.length - 1] = item;
    }
}
