interface S {
    public int sum(int a,int b);
}
public class B {
    public static void main(String[] args) {
        S obj = (a,b) -> {
            int sum = a+b;
            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println("Sum = " + sum);
            return sum;
        };
        int result = obj.sum(4,5);
        System.out.println(result);
    }
}
