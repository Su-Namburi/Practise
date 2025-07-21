import java.util.Arrays;
import java.util.Collections;

public class ListDemo {
    public static void main(String[] args) {
        String[] strArr = {"harry","draco","cho"};
//        Arrays.sort(strArr, Collections.reverseOrder());
        //Arrays.sort(strArr);//, (a,b) -> a.compareTo(b));
        Arrays.sort(strArr, (a,b) -> b.length() - a.length());
        System.out.println(Arrays.toString(strArr));
    }
}
