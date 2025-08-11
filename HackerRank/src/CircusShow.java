class Result {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(x2 > x1 && v2 > v1) {
            return "NO";
        }
        if(v1 != v2) {
            int n = (x2 - x1)/(v1 - v2);
            int r = (x2 - x1) % (v1 - v2);
            if(r == 0 && n >= 0) {
                return "YES";
            }
            else {
                return "NO";
            }
        }
        else {
            return (x1 == x2 ? "YES" : "NO");
        }

    }
}
public class CircusShow {
    public static void main(String[] args) {
        String ans = Result.kangaroo(0,2,5,3);
        System.out.println(ans);
    }
}
