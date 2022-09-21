import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class ScriptParser {
    public static Map<String, List<String>> parseScript(String script) {

        if (script == null) {
            return null;
        }
        Map<String, List<String>> output = new HashMap<>();
        for (String line : script.split("\n")) {
            String[] parts = line.split(":");
            String character = parts[0].trim();
            String dialogue = parts[1].trim();
            List<String> list = output.get(character);
            if (list == null) {
                list = new ArrayList<>();
                output.put(character, list);
            }
            list.add(dialogue);
        }
        return output;
    }

    public static void main(String[] args) {
        Map<String, List<String>> output = parseScript("""
                You: What do you think of this problem?
                I: it's a bit sus
                You: I bet you'll be able to figure it out!
                Someone: I'll be here to help if you need it.""");
        System.out.println(output);
    }
}
