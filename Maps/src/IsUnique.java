import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        Set<Character> charSet = new HashSet<>();
        for(char c : str.toCharArray()) {
            charSet.add(c);
        }
        if(charSet.size() == str.length()) {
            System.out.println("has unique");
        }
        else {
            System.out.println("No");
        }
    }
}
