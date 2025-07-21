import java.util.ArrayList;
import java.util.List;

public class OddElements {
    public static int getMinTuningOperations(List<Integer> queryTimes) {
        int totalRounds = 0;

        while (true) {
            boolean changed = false;

            for (int i = 0; i < queryTimes.size(); i++) {
                int num = queryTimes.get(i);

                if (num % 2 == 0 && num > 0) {
                    queryTimes.set(i, num / 2);
                    changed = true;
                }
            }

            if (changed) {
                totalRounds++;
            } else {
                break;
            }
        }

        return totalRounds + 1;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3,24));
        int result = getMinTuningOperations(list);
        System.out.println(result);
    }
}
