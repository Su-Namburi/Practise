import java.util.Scanner;

public class RightTriangle {
    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Case #" + i + ":");
            int n = sc.nextInt();
            rightTriangle(n);
        }
    }
}
