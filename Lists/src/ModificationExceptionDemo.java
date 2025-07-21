import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ModificationExceptionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana","kiwi","cherry","mango"));
        //list.add("mango"); cant add, only update. gives unsupported operation exception

//        for(String fruit : list) {
//            if(fruit.equalsIgnoreCase("pineapple")) {
//                list.remove(fruit);
//            }
//        }
        //fail fast iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            if(fruit.equalsIgnoreCase("banana")) {
                it.remove();
            }
        }
        //fail safe iterator
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("monkey"); list1.add("lion"); list1.add("cheetah");
        list1.add("panther");list1.add("tiger");
        for(String s : list1) {
            if(s.equalsIgnoreCase("monkey")) {
                list1.remove(s);
            }
        }
        System.out.println(list1);
    }
}
