import java.util.Scanner;

class Result {

    public static int[] reverseArray(int[] arr) {
        // Write your code here
        int p1=0;int temp=0;
        int p2=arr.length-1;
        while(p2>p1) {
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

}

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = Result.reverseArray(arr);

        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
