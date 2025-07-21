import java.io.*;
import java.util.*;

public class FirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int[] arr1 = new int[N];
        int k = 0;
        for (int j = 0; j < N; j++) {
            if (arr[j] == X) {
                arr1[k] = j;
                k++;
            }
        }
        for(int i = 0;i<N;i++) {
            System.out.println(arr1);
        }
//        System.out.println(arr[0] + " " + arr[k]);
    }

}
