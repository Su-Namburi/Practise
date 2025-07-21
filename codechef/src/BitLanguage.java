import java.util.Scanner;

public class BitLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0;
        for (int i = 0; i < N; i++) {
            String st;
            st = sc.next();
            if (st.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
