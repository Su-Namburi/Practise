import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++) {
            long sum = 0;
            int N = sc.nextInt();
            long expectedSum = ((long)(N+1) + (N+2))/2;
            int[] arr = new int[N];
            for(int j=0;j<N;j++) {
                arr[j] = sc.nextInt();
                sum = sum + arr[j];
            }
            System.out.println(expectedSum - sum);
        }
    }
}
