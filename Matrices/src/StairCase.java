class Result {
    public static void staircase(int n) {

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(n-i >= j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
public class StairCase {
    public static void main(String[] args) {
        Result.staircase(4);
    }
}
