package unit11;

// 2018 FRQ #2
// https://secure-media.collegeboard.org/apc/ap18-frq-computer-science-a.pdf#page=7
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class WordPair {

    private String first;
    private String second;

    /** Constructs a WordPair object. */
    public WordPair(String first, String second) {
        this.first = first;
        this.second = second;
        /* implementation not shown */ }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        return this.first;
        /* implementation not shown */ }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return this.second;
        /* implementation not shown */ }

}

public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        allPairs = new ArrayList <WordPair>();
        for (int i = 0; i < words.length; i++){
            for (int w = i+1; w < words.length; w++){
                allPairs.add(new WordPair(words[i], words[w]));
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     * the number of matches that have two of the same String
     */
    public int numMatches() {
        int count = 0;
        for (int i = 0; i < allPairs.size(); i++){
            if (allPairs.get(i).getFirst() == allPairs.get(i).getSecond())
                count++;
        }
        return count; // replace me!
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    static void checkWordPairList(String[] words, WordPairList wpl, int expected) {
        check(wpl.allPairs.size() == expected);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Arrays.stream(words).forEach(x -> map.put(x, map.computeIfAbsent(x, m -> 0) + 1));
        for (WordPair wp : wpl.allPairs) {
            check(Arrays.stream(words).anyMatch(wp.getFirst()::equals));
            check(Arrays.stream(words).anyMatch(wp.getSecond()::equals));
            check(!wp.getFirst().equals(wp.getSecond()) || map.get(wp.getFirst()) > 1);
        }
    }

    public static void main(String[] args) {
        String[] wordNums = { "one", "two", "three" };
        WordPairList exampleOne = new WordPairList(wordNums);
        checkWordPairList(wordNums, exampleOne, 3);

        String[] phrase = { "the", "more", "the", "merrier" };
        WordPairList exampleTwo = new WordPairList(phrase);
        checkWordPairList(phrase, exampleTwo, 6);

        String[] moreWords = { "the", "red", "fox", "the", "red" };
        WordPairList exampleThree = new WordPairList(moreWords);
        checkWordPairList(moreWords, exampleThree, 10);
        check(exampleThree.numMatches() == 2);

        System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}