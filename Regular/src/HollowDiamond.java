import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++) {
            int N = sc.nextInt();
            for(int j=0;j<=N;j++) {
                if(i == N/2) {
                    System.out.print("*");
                    System.out.print("*");
                }
                else {
                    System.out.println("*");
                }
            }
            System.out.println();
        }
    }
}
