import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("sun", "tree", "sky", "flower", "rock");

        Map<Integer,List<String>> map = words.stream().collect(Collectors.groupingBy(String :: length));
        System.out.println(map);

        String str = "abcbdeaf";
        Set<Character> first = new HashSet<>();

    }
}
