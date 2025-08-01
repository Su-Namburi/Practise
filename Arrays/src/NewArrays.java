import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class NewArrays {
    public static void main(String[] args) {
//        System.out.println("just a dmo to see if this get added to github");
//        System.out.println("lets see if i can add this");

        int a = -8;
        System.out.println(a>>2);
        System.out.println(a>>>2);
//        System.out.println(a>>3);
//        System.out.println("-------------------");
//        System.out.println(a<<1);
//        System.out.println(a<<2);
//        System.out.println(a<<3);
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(2,"Sudha");
        Student s2 = new Student(1,"Vasu");
        students.add(s1); students.add(s2);
        //Collections.sort(students);
        //System.out.println(students);
        Comparator<Student> c = (st1,st2) -> st2.id - st1.id;
        //Collections.sort(students,Collections.reverseOrder());
        System.out.println(students);
    }
}
