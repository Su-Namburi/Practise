public class TrailingZeros {
    public static void main(String[] args) {
        int N = 100;
        int count = 0;
        while (N > 0) {
            count = count + N/5;
            N = N/5;
        }
        System.out.println(count);
    }
}
