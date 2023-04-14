


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SpellingBee {

    private char[] letters;
    private char mustUse;

    public SpellingBee(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    // does it use only the allowed letters?
    // does it use the required letter?
    // is it at least 4 characters? 
    public boolean checkWord(String word) {
        boolean hasReq = false;
        boolean fromLets = false;
        char[] wordsies = new char[word.length()];
        for (int l = 0; l < word.length(); l++){
            wordsies[l] = word.charAt(l);
            if (word.charAt(l) == mustUse)
              hasReq = true;
            for (int is = 0; is < letters.length; is++){
                while(word.charAt(l)== letters[is])
                    fromLets = true;
        }
        if (hasReq && fromLets)
            return true;
    }       
    
    return true;
    }

    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");
        
        // solve me!
        SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');
 
        for (int t = 0; t < words.length; t++){
            if (bee.checkWord(words[t]) == true)
                System.out.println(words[t]);
        }

        // sort words!

        // what position in the sorted list is the word "search" ?

    }
}