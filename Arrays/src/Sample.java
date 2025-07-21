import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample {
    public static void main(String[] args) {
        int datasetid = 1;
        String q = "select datasetname from datasetfieldnames where deletedflag =0 and datasetid ='" + datasetid + "'";
        String[] queryWords;
        queryWords = q.split(" ");

        for(String s : queryWords) {
            System.out.print(s+ " ");
    }
    }
}

//SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//String d = "08/01/2023 12:00:00";
//SimpleDateFormat formatter = new SimpleDateFormat(d);
//
//String d1 = "09/01/2023 12:00:00";
//Date date1 = null;
//Date date2 = null;
//
//        try {
//date1 = formatter.parse(d);
////date2 = formatter.parse(d1);
////System.out.println(date1.before(date2));
//            System.out.println(date1);
//            System.out.println(date1.toString());
//
//String newDate = formatter.format(date1);
//            System.out.println(newDate);
//
//        } catch (ParseException e) {
//        System.out.println(" Invalid format" + e);
//        System.out.println(d.getClass().getName());
//        System.out.println(date1.getClass().getName());