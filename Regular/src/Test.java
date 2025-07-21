import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        Supplier<Integer> randomSupplier = () -> (int) Math.floor(Math.random() * 10);
//        Supplier<Double> supp = Math::random;
//        System.out.println(supp.get());
//        System.out.println(randomSupplier.get());
          List<String> list = Arrays.asList("Anna","Bob","Clara");
          List<String> filteredList = list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
          int count = (int)list.stream().filter(s -> s.startsWith("S")).count();
        System.out.println(count);
        System.out.println(filteredList);
        List<String> upper = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        List<String> newList = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenList = nums.stream().filter(num -> num %2 ==0).collect(Collectors.toList());
        List<Integer> powerList = nums.stream().map(num -> (int)Math.pow(num,2)).collect(Collectors.toList());
        System.out.println(powerList);


    }
}
