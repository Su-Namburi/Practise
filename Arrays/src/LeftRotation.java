import java.util.Scanner;

public class LeftRotation {
    public static int[] rotateLeft(int d , int[] arr) {
        int N = arr.length;
        int[] rotated = new int[N];
        for(int i=0;i<N - d;i++) {
            rotated[i] = arr[i + d];
        }
        for(int i=0;i<d;i++) {
            rotated[N - d + i] = arr[i];
        }
        return rotated;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = rotateLeft(d,arr);
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
