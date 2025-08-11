import java.util.Arrays;
import java.util.List;

public class ApplesOranges {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int s = 7; int t = 10;
        int aCount = 0; int oCount = 0;
        List<Integer> apples = Arrays.asList(2,3,-4);
        List<Integer> oranges = Arrays.asList(3,-2,-4);

        for(Integer i : apples) {
            if((i+a) >= s && (i+a) <= t) {
                aCount++;
            }
        }
        for(Integer j : oranges) {
            if((j+b) >= s && (j+b) <= t) {
                oCount++;
            }
        }
        System.out.println(aCount + " " + oCount);
    }
}
