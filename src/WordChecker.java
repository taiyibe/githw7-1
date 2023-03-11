import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    private String Text;
    private Set<String> words;

    public WordChecker(String txt) {
        Text = txt;
        words = new HashSet<>();
        for (String word : Text.split("\\P{IsAlphabetic}+")) {
            words.add(word);
        }
    }

    public boolean hasWord(String wrd) {
        return words.contains(wrd);
    }
}
