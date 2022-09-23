import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InAtleastTwo {
    public static Set<String> inAtleastTwoSets(Set<String> a, Set<String> b, Set<String> c) {
        // Elements present in atleast two sets is the union of (a and b), (a and c), (b and c)
        // Above, x and y represents the intersection of x and y
        Set<String> output = new HashSet<>();
        Set<String> o = new HashSet<>();
        // First we add a, b to output
        output.addAll(a);
        output.addAll(b);
        // Now intersection of output with c gives the union of (a and c), (c and b)
        output.retainAll(c);
        o.addAll(a);
        //Now we find intersection of a and b
        o.retainAll(b);
        // At this point we add the elements of o to output to get union of all three sets
        output.addAll(o);
        return output;
    }

    public static void main(String[] args) {
        Set<String> output = inAtleastTwoSets(new HashSet<String>(Arrays.asList("1", "2", "3", "10")),
                new HashSet<>(Arrays.asList("3", "4", "5", "10")), new HashSet<>(Arrays.asList("1", "5", "6", "10")));
        System.out.println(output);
    }
}
