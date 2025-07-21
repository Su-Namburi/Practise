import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Sales");
        list1.add("Profit");
        list1.add("Country");
        list1.add("Segment");
        list1.add("UnitsSold");
        list1.add("MonthName");
//        //adding into list2
//        list2.add("sales");
//        list2.add("profit");
//        list2.add("monthName");
//        System.out.println(list1);
//        System.out.println(list2);
//
//        list1.removeIf(item -> list2.stream().anyMatch((s -> s.equalsIgnoreCase(item)))); //list1 nundi list2 lo unna elents anni teesesthundi. non common elements remain avthayi
//        System.out.println(list1);
//        System.out.println(list2);
        list2.addAll(list1);
        System.out.println("List2 : " + list2);
    }
}
