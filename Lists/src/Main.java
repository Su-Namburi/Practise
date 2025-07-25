import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
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
    public String toString() {
        return this.id + " " + this.name;
    }

}

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Amit"));
        students.add(new Student(1, "Sudha"));
        students.add(new Student(3, "Riya"));

        Collections.sort(students);
        System.out.println(students);

        //comparator : when we want to order the objects. need to implement compare method
        students.sort((s2,s1) -> s2.name.compareTo(s1.name));

        //Collections.sort(students, Collections.reverseOrder());
        System.out.println(students);


    }
}