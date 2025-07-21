import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] arr = {"hello","bonjour","hallo"};
        List<String> list = Arrays.asList(arr);
        Collections.sort(list);
        ArrayList<Integer> intList = new ArrayList<>(List.of(1,3,4,2));
        System.out.println(list);
        Collections.sort(intList,(a,b) -> b - a);
        Collections.reverse(intList);
        //first sorted and then reversed order is printed
        System.out.println("Elements of intList : ");
        intList.forEach(n -> System.out.println(n));

//        int[] source = {3,4,2,6,8,7};
//        int[] destination = Arrays.copyOf(source,source.length);
//        System.out.println("Arrays.copyOf demo");
//        printArr(destination);
//        int[] destination1 = new int[source.length];
//        System.arraycopy(source,0,destination1,0,source.length);
//        System.out.println("System.arraycopy demo");
//        printArr(destination1);

    }
}
//Thread currThread = Thread.currentThread();
//System.out.println(currThread.getName());