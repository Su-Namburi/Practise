import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );
        //List<String> result = listOfLists.stream().flatMap(List::stream).filter(s -> s.startsWith("S")).collect(Collectors.toList());
        List<String> result = listOfLists.stream().flatMap(List::stream).map(String::toLowerCase).sorted().filter(s->s.startsWith("s")).collect(Collectors.toList());
//        System.out.println(result);

        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );
        List<Integer> sample = Arrays.asList(2,5,1,7,8);
        names.stream().forEach(System.out::println);
        String abc = names.stream().reduce("",(a,b) -> a +" "+b);
        int output = sample.stream().reduce(0,(a,b) -> a+b);
        long count = names.stream().count();
        System.out.println("count : " + count);
        Optional<String> first = names.stream().findFirst();
        System.out.println(first);
        System.out.println(output);
        System.out.println(abc.trim());

    }
}
