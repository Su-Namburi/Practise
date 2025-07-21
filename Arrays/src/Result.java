import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Result {
    public static int[] compareTriplets(int[] a,int[] b) {
        int N = a.length;
        int[] scores = new int[2];
        for(int i=0;i<N;i++){
            if(a[i] > b[i]) {
                scores[0] = scores[0] + 1;
            }
            else if(a[i] < b[i]) {
                scores[1] = scores[1] + 1;
            }
        }
        return scores;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        for(int i=0;i<3;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++) {
            b[i] = sc.nextInt();
        }
        int[] res = compareTriplets(a,b);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }

        Map<Integer,Integer> freq = new HashMap<>();

    }
}
