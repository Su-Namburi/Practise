import java.util.Arrays;
import java.util.Scanner;

public class MinMaxPartition {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for(int n=0;n<N;n++) {
            arr[n] = sc.nextLong();
        }
        Arrays.sort(arr);
        long diff = 0; long minDiff = arr[1] - arr[0];
        int l=0,r=0;
        if(N < 2) {
            return;
        }
        for(int i=0;i<N-1;i++) {
            diff = arr[i+1] - arr[i];
            minDiff = Math.min(minDiff,diff);
            //System.out.println(minDiff);
        }
        System.out.println(minDiff);

    }
}
