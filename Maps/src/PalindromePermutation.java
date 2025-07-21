import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class PalindromePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        HashMap<Character,Integer> countMap = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(countMap.containsKey(c)) {
                countMap.put(c,countMap.get(c) + 1);
            }
            else {
                countMap.put(c,1);
            }
        }
        int count = 0;
        for(Character c : countMap.keySet()) {
            if(countMap.get(c) % 2 == 1) {
                count++;
            }
        }
        System.out.println(count == 1 ? "true" : "false");
    }
}
