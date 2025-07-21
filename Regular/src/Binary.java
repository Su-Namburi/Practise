import java.util.Scanner;

public class Binary {
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            System.out.println(n);
            count = count + (n & 1);
            n = n >> 1;
        }
        return count;
    }
    static boolean checkBit(int n, int i) {
        return (n >> i) % 2 != 0;
    }
    public static void main(String[] args) {

//        int i = 9;
//        System.out.println(countSetBits(i));
        int n=8; int i=2;
        System.out.println(checkBit(n,i));
    }
}
