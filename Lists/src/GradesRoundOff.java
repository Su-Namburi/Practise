import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradesRoundOff {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73,67,38,33);
        List<Integer> result = new ArrayList<>();

        for(Integer i : grades) {
            if(i >= 38) {
                if(i % 5 == 0) {
                    result.add(i);
                }
                else {
                    int temp = i % 5;
                    int multiple = i + (5 - temp);
                    if((multiple - i) < 3) {
                        result.add(multiple);
                    }
                    else {
                        result.add(i);
                    }
                }
            }
            else {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
