package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (sentence.isEmpty()) {
            return map;
        }
        var sentenceArr = sentence.split(" ");
        List<String> uniqueWordsList = new ArrayList<>(Arrays.asList(sentenceArr));

        for (String word : sentenceArr) {
            if (!uniqueWordsList.contains(word)) {
                uniqueWordsList.add(word);
            }
        }

        for (String word : uniqueWordsList) {
            map.put(word, countOccurences(sentenceArr, word));
        }

        return map;
    }
    public static String toString(Map<String, Integer> map) {
        StringBuilder builder = new StringBuilder();
        if (map.isEmpty()) {
            return "{}";
        }

        builder.append("{\n");
        for (String item : map.keySet()) {
            builder.append("  ").append(item).append(": ").append(map.get(item)).append("\n");
        }
        builder.append("}");

        return String.valueOf(builder);
    }

    public static int countOccurences(String[] sentence, String word) {
        if (sentence.length == 0) {
            return 0;
        }
        var count = 0;

        for (var i = 0; i < sentence.length; i++) {
            if (word.equals(sentence[i])) {
                count++;
            }
        }

        return count;
    }
}
//END
