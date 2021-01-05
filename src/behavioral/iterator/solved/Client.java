package behavioral.iterator.solved;

public class Client {

    public static void main(String[] args) {

        Collection<String> collection = new LettersCollection();
        Iterator<String> iterator = collection.getIterator();

        while (!iterator.isDone()) {
            String item = iterator.getNext();

            System.out.println("Item: " + item);
        }

        collection.addItem("F");
        iterator = collection.getIterator();

        while (!iterator.isDone()) {
            String item = iterator.getNext();

            System.out.println("Item: " + item);
        }
    }
}
