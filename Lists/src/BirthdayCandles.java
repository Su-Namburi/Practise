import java.util.Arrays;
import java.util.List;

public class BirthdayCandles {
    public static void main(String[] args) {

        List<Integer> candles = Arrays.asList(4,4,1,3);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(Integer i : candles) {
            if(i > max) {
                max = i;
            }
        }
        for(Integer i : candles) {
            if(i == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
