import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordChecker {

    private Set<String> words;

    public WordChecker(String txt) {
        words = new HashSet<>(List.of(txt.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String wrd) {
        return words.contains(wrd);
    }
}
