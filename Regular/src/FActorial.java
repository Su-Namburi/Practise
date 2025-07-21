import java.util.Scanner;

public class FActorial {
        static long factorial(long n)
        {
            long M = 1000000007;
            if (n == 0 || n == 1)
                return 1;
            return (n * factorial(n - 1))%M;
        }

        public static void main(String[] args)
        {

            long ans = factorial(5);
            System.out.println("Factorial of 5 is :" + ans);
        }
}
