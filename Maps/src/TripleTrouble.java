import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TripleTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextLong();
        }

        HashMap<Long,Integer> mp = new HashMap<>();
        for(int j=0;j<N;j++) {
            if(mp.containsKey(arr[j])) {
                mp.put(arr[j],mp.get(arr[j])+1);
            }
            else {
                mp.put(arr[j],1);
            }
        }
        System.out.println(mp);

        for(Map.Entry<Long,Integer> entry : mp.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}
