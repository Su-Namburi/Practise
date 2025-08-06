import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(2,3,1,5,4);
        Collections.sort(arr);
        int sum = 0;
        int n = arr.size();
        for(Integer i : arr) {
            sum += i;
        }

        int minSum = sum - arr.get(n - 1);
        int maxSum = sum - arr.get(0);

        System.out.println(minSum + " " + maxSum);

    }
}
