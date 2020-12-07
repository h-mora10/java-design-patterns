package structural.flyweight.current;

public class Client {

    public static void main(String[] args) {

        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello! I'm a word processor!";

        for (char ch : textToAdd.toCharArray()) {
            processor.addLetter(new Letter(String.valueOf(ch)));
        }

        processor.printLetters();
    }
}
