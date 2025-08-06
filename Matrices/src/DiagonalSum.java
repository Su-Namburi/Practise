import java.util.Arrays;
import java.util.List;

public class DiagonalSum {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),Arrays.asList(9, 8, 9));
//        System.out.println(arr);
        int left = 0;
        int right = 0;
        int n = arr.size();
        for(int i = 0; i < n; i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(n-i-1);
        }
        System.out.println(Math.abs(left-right));
    }
}
