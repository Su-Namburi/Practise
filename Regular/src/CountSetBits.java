import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++) {
            long N = sc.nextLong();
            long count = 0;

            while (N != 0) {
                count = count + (N & 1);
                System.out.println("and op :" + (N&1));
                System.out.println("count : " + count);
                N = N >> 1;
                System.out.println("N :" + N);
            }
            System.out.println();
            System.out.println();
            System.out.println(count);
        }
    }
}
