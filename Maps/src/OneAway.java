import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class OneAway {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String st2 = reader.readLine();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c,1);
        }
        for(char c : st2.toCharArray()) {
            if(map.containsKey(c)) {
                map.remove(c);
            }
        }
        if(map.size() <= 1) {
            //System.out.println(map);
            System.out.println("true");
        }
        else {
            System.out.println("false");
            //System.out.println(map);
        }
    }
}
