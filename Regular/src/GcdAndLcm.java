public class GcdAndLcm {
    public static void main(String[] args) {
        int a = 605904;
        int b = 996510762;
        int product = a * b;
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
        System.out.println(product/a);

//        int c = 605904;
//        int d = 996510762;
    }
}
