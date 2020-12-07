package structural.flyweight.solved;

public class Client {

    public static void main(String[] args) {

        // Now each letter will be instantiated once
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello! I aaaaaam a word processooooor!";

        LetterFactory factory = new LetterFactory();

        for (char ch : textToAdd.toCharArray()) {
            processor.addLetter(factory.createLetter(String.valueOf(ch)));
        }

        processor.printLetters();
    }
}
