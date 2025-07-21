import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int[] arr,int K) {
        int low = 0; int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            int val = arr[mid];
            System.out.print(low + " ");
            System.out.print(high + " ");
            System.out.println(mid);
            if(val < K) {
                low = mid + 1;
            }
            else if(val > K) {
                high = mid - 1;
            }
            else {
                return true;
            }
        }
        System.out.println();
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int n=0;n<N;n++) {
            arr[n] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean found = binarySearch(arr,K);
        if(found)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
