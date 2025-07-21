import java.util.Scanner;

public class AddReverseNumbers {
    public static int reverseNumber(int n) {
        int temp = 0,rev = 0;
        while(n>0) {
            temp = n % 10;
            rev = (rev * 10) + temp;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        for(int i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result = reverseNumber(reverseNumber(a) + reverseNumber(b));
            System.out.println(result);
        }
    }
}
