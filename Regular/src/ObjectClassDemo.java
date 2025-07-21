class Student {
    int id;
    String name;
    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
//    @Override
//    public String toString() {
//        System.out.println("I overrode the default toString method");
//        return "id : " + id + "Name : " + name;
//    }
}
class S extends Student {

}
public class ObjectClassDemo {
    //root class of all java classes
    //part of java.lang package
    public static void main(String[] args) {
        Student obj = new Student(25,"Sudha");
        Student obj1 = new Student(25,"Sudha");
        //Student obj1 = obj;
        //Integer a = 5; Integer b = 5;
        //String a = "hello"; String b = "hello";
        String a = new String("hello");
        String b = "hello";
//        System.out.println(a.equals(b));
//        System.out.println(obj1.equals(obj));
        S sObj = new S();
        if(b instanceof String c){
            System.out.println(c.toUpperCase());
        }
        //System.out.println(obj.toString());
    }

}
