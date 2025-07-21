import java.io.*;
import java.util.*;

public class UniqueElements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> count = new HashMap<>();
        for(int j=0;j<N;j++) {
            if(count.containsKey(arr[j])) {
                //count.get(arr[j]) += 1;
            }
            else {
                count.put(arr[j],1);
            }
        }
        for(int k=0;k<N;k++) {
            if(count.get(arr[k]) == 1) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}
