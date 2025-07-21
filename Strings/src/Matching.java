import java.util.ArrayList;
import java.util.List;

public class Matching {
    public static List<String> getFilteredList(List<String> sample,String condition) {
        List<String> result = new ArrayList<>();
        switch (condition) {
            case "Does Not End With" :
                break;
            case "Does Not Contain" :
                break;
            case "Equals" :
                break;
            case "Does Not Equal" :
                break;
            case "Ends With" :
                break;
            case "Begins With" :
                break;
            case "Contains" :
                break;
            case "Does Not Begin With" :
                break;
        }
        for(String s : sample) {
            if(s.endsWith("a")) {
                result.add(s);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> sample = new ArrayList<>();
        sample.add("Germany");
        sample.add("Canada");
        sample.add("Mexico");
        sample.add("united states of america");
        for(String s : sample) {
            if(s.endsWith("a")) {
                //result.add(s);
            }
        }

        System.out.println(sample);
        String st1 = "Germany"; String st2 = "m";
        //System.out.println(getFilteredList(sample));


    }
}
