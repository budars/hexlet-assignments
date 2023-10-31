package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String characterSet, String word) {
        List<Character> listWord = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            listWord.add(ch);
        }
        List<Character> finalUniqueListWord = new ArrayList<>();
        var count = 0;

        for (char item : listWord) {
            if (!finalUniqueListWord.contains(Character.toLowerCase(item))) {
                finalUniqueListWord.add(Character.toLowerCase(item));
            }
        }

        System.out.println(finalUniqueListWord);

        for (char ch : finalUniqueListWord) {
            if (countMatches(characterSet.toLowerCase(), ch) >= countMatches(word.toLowerCase(), ch)) {
                count++;
            }
        }

        System.out.println(count);
        return count == finalUniqueListWord.size();
    }

    public static int countMatches(final CharSequence str, final char ch) {
        if (str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
//END
