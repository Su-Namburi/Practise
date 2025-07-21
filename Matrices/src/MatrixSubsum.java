import java.util.Scanner;

public class MatrixSubsum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = sc.nextInt(); int j = sc.nextInt();
        int k = sc.nextInt(); int l = sc.nextInt();
        int[][] mat= new int[N][N];
        for(int m = 0;m<N;m++) {
            for(int n = 0;n<N;n++) {
                mat[m][n] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int m=i;m<=k;m++) {
            for(int n=j;n<=l;n++) {
                sum = sum + mat[m][n];
            }
        }
        System.out.println(sum);

    }
}
