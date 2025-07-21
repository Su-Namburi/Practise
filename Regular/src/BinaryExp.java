public class BinaryExp {
    public static void main(String[] args) {
        int N = 16;
        int c=0;
        System.out.println(N-1);
        System.out.println(N & (N-1));
        while(N>0) {
            N = N & (N-1);
            c++;
        }
        System.out.println("count : " + c);
    }
}
