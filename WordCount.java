import java.util.Map;
import java.util.HashMap;

class WordCount {
    // Frequency of word in a string seperated by " " irrespective
    // of the case
    public static Map<String, Integer> wordCount(String input) {
        // null check
        if (input == null) {
            return null;
        }
        Map<String, Integer> output = new HashMap<>();
        String[] seperatedWords = input.split(" ");
        for (String word : seperatedWords) {
            // Initialize the count to 0 by fetching the word in
            // the output
            int count = output.getOrDefault(word, 0);
            
            // Increase the count 
            count++;
            
            // Finally, map the updated count to the word
            output.put(word, count);
        }
        return output;
    }

    public static void main(String[] args) {
        Map<String, Integer> countMap = wordCount("E N T H U S I A S T I C");
        // using assert to test our output
        assert countMap.size() == 9;
        assert countMap.get("E") == 1;
        assert countMap.get("T") == 2;
    }
}
