import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class URLify {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        str = str.trim();
        List<Character> charList = new ArrayList<>();
        for(char c : str.toCharArray()) {
            if(c == ' ') {
                charList.add('%');
                charList.add('2');
                charList.add('0');
            }
            else {
                charList.add(c);
            }
        }
        String url = charList.stream().map(String::valueOf).collect(Collectors.joining());
        String string = charList.toString().substring(1, 3 * charList.size() - 1).replaceAll(", ", "");
        System.out.println(url);
        System.out.println(string);
    }
}
