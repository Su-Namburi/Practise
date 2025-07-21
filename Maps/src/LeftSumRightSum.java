import java.io.*;
import java.util.*;

public class LeftSumRightSum {

    public static int leftSum(int[] arr, int l) {
        int leftSum = 0;
        for (int i = 0; i < l; i++) {
            leftSum = leftSum + arr[i];
        }
        return leftSum;
    }

    public static int rightSum(int[] arr, int r) {
        int rightSum = 0;
        for (int i = r + 1; i < arr.length; i++) {
            rightSum = rightSum + arr[i];
        }
        return rightSum;
    }

    public static int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int n = 0; n < N; n++) {
            arr[n] = sc.nextInt();
        }
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();


        for (int i = 0; i < N; i++) {
            if (i == 0) {
                leftMap.put(i, 0);
            } else {
                leftMap.put(i, leftSum(arr, i));
            }
        }
        System.out.println(leftMap);
        for(int j=0;j<N;j++) {
            if(j == N-1) {
                rightMap.put(j,0);
            }
            else {
                rightMap.put(j,rightSum(arr,j));
            }
        }
        System.out.println(rightMap);
        for(int k=0;k<N;k++) {
            System.out.print(Math.abs(leftMap.get(k) - rightMap.get(k)) + " ");
        }

    }

}
