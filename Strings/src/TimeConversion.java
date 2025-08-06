import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Result {
    public static String timeConversion(String s) throws ParseException {
        DateFormat input = new SimpleDateFormat("hh:mm:ssa");
        DateFormat output = new SimpleDateFormat("HH:mm:ss");

        Date date = input.parse(s);
        return output.format(date);
    }
}
public class TimeConversion {
    public static void main(String[] args) throws ParseException {
       String result = Result.timeConversion("07:05:45PM");
        System.out.println(result);
    }
}
