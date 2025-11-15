package package24mapswithtechpro;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectForMaps {

    public static void main(String[] args) throws IOException {

        /*
            1. Create a text file inside the package19maps package
            2. Type the following text inside the text file:
                Java is easy to learn.
                Learn Java, earn money.
                Java is easy if you study well.
                To learn Java, type codes.

            3. Type code to print every word is used how many times in the text.
         */

        Map<String, Integer> wordCounter = new HashMap<>();

        List<String> lines = Files.readAllLines(Paths.get("src/package19maps/text.txt"), StandardCharsets.UTF_8);

        for (String sentences : lines) {
            String words[] = sentences.split(" ");

            for (String word : words) {
                if (word.endsWith(".") || word.endsWith(",")) {
                    word = word.substring(0, word.length() - 1);
                }

                if (!wordCounter.containsKey(word)) {
                    wordCounter.put(word, 1);
                }else {
                    wordCounter.put(word, wordCounter.get(word) + 1);
                }

            }

        }
        System.out.println("Total words: " + wordCounter);

    }

}
