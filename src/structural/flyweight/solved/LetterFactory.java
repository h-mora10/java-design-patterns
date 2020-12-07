package structural.flyweight.solved;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private Map<String, Letter> lettersMap = new HashMap<>();

    public Letter createLetter(String key) {
        if (lettersMap.containsKey(key)) {
            return lettersMap.get(key);
        }

        Letter letter = new Letter(key);
        lettersMap.put(key, letter);
        return letter;
    }
}
