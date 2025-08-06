import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(-4,3,-9,0,4,1);
        int pCount = 0;
        int nCount = 0; int zCount = 0;
        int n = arr.size();
        for(Integer i : arr) {
            if(i < 0) {
                nCount++;
            } else if (i > 0) {
                pCount++;
            } else if (i == 0) {
                zCount++;
            }
        }
        System.out.println((float)pCount/n);
        System.out.println((float)nCount/n);
        System.out.println((float)zCount/n);
    }
}
