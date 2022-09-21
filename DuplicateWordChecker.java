import java.util.HashSet;
import java.util.Set;

class DuplicateWordChecker {
    public static boolean hasDuplicateWords(String input) {
        if (input == null) {
            return false;
        }
        String[] words = input.toLowerCase().split(" ");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (set.contains(word)) {
                return true;
            } else {
                set.add(word);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean hasDuplicateWords = hasDuplicateWords("acb Acb DBc cdB bdc");
        System.out.println(hasDuplicateWords);
    }
}
