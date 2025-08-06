import java.util.Arrays;
import java.util.List;

public class BigSum {
    public static void main(String[] args) {
        List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long sum = 0;
        for(Long l : ar) {
            sum = sum + l;
        }
        System.out.println("Sum : " + sum);
    }
}
